package Ex4;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {
    // Sử dụng 2 Queue riêng biệt để đảm bảo FIFO tuyệt đối trong từng nhóm
    private Queue<EmergencyPatient> emergencyQueue;
    private Queue<EmergencyPatient> normalQueue;

    public EmergencyQueue() {
        this.emergencyQueue = new LinkedList<>();
        this.normalQueue = new LinkedList<>();
    }

    // Thêm bệnh nhân vào hàng đợi tương ứng
    public void addPatient(EmergencyPatient p) {
        if (p.getPriority() == 1) {
            emergencyQueue.add(p);
            System.out.println(">>> TIẾP NHẬN KHẨN CẤP: " + p.getName());
        } else {
            normalQueue.add(p);
            System.out.println(">>> Tiếp nhận thông thường: " + p.getName());
        }
    }

    // Gọi bệnh nhân tiếp theo
    public EmergencyPatient callNextPatient() {
        // Tiêu chí 1: Luôn kiểm tra và ưu tiên gọi bệnh nhân trong Queue Cấp cứu trước
        if (!emergencyQueue.isEmpty()) {
            EmergencyPatient p = emergencyQueue.poll();
            System.out.println("<<< BÁC SĨ GỌI KHÁM NGAY: " + p.getName() + " (CẤP CỨU)");
            return p;
        }
        // Tiêu chí 2: Khi Queue Cấp cứu rỗng, mới gọi bệnh nhân Thông thường
        else if (!normalQueue.isEmpty()) {
            EmergencyPatient p = normalQueue.poll();
            System.out.println("<<< Bác sĩ gọi khám: " + p.getName() + " (Thông thường)");
            return p;
        }

        System.out.println("!!! Hiện không có bệnh nhân nào đang chờ.");
        return null;
    }

    // Hiển thị toàn bộ danh sách chờ
    public void displayQueue() {
        System.out.println("\n--- DANH SÁCH BỆNH NHÂN ĐANG CHỜ KHÁM ---");

        System.out.println("🔴 HÀNG ĐỢI CẤP CỨU (Ưu tiên khám trước):");
        if (emergencyQueue.isEmpty()) {
            System.out.println("   -> (Trống)");
        } else {
            for (EmergencyPatient p : emergencyQueue) {
                System.out.println("   -> " + p);
            }
        }

        System.out.println("🔵 HÀNG ĐỢI THÔNG THƯỜNG:");
        if (normalQueue.isEmpty()) {
            System.out.println("   -> (Trống)");
        } else {
            for (EmergencyPatient p : normalQueue) {
                System.out.println("   -> " + p);
            }
        }
        System.out.println("-----------------------------------------\n");
    }
}
