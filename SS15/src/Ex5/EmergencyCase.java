package Ex5;

import java.util.Stack;

public class EmergencyCase {
    private Patient patient;
    private Stack<TreatmentStep> steps; // Stack lưu các bước xử lý (LIFO)

    public EmergencyCase(Patient patient) {
        this.patient = patient;
        this.steps = new Stack<>();
    }

    public Patient getPatient() {
        return patient;
    }

    // Thêm một bước xử lý mới (Push)
    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println("   [+] Đã thêm xử lý: " + step.getDescription());
    }

    // Hoàn tác bước xử lý gần nhất (Pop)
    public TreatmentStep undoStep() {
        if (!steps.isEmpty()) {
            TreatmentStep undone = steps.pop();
            System.out.println("   [-] HOÀN TÁC (UNDO): Đã hủy bỏ thao tác -> " + undone.getDescription());
            return undone;
        }
        System.out.println("   [!] Không có thao tác nào để hoàn tác.");
        return null;
    }

    // Hiển thị lịch sử các bước đã thực hiện
    public void displaySteps() {
        System.out.println("\n--- LỊCH SỬ ĐIỀU TRỊ: " + patient.getName() + " ---");
        if (steps.isEmpty()) {
            System.out.println("   (Chưa có bước điều trị nào)");
        } else {
            // Hiển thị từ mới nhất đến cũ nhất
            for (int i = steps.size() - 1; i >= 0; i--) {
                System.out.println("   -> " + steps.get(i));
            }
        }
        System.out.println("----------------------------------------");
    }
}
