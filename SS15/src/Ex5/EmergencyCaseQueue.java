package Ex5;
import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases; // Queue lưu danh sách ca cấp cứu (FIFO)

    public EmergencyCaseQueue() {
        this.cases = new LinkedList<>();
    }

    // Đưa bệnh nhân vào hàng đợi
    public void addCase(EmergencyCase c) {
        cases.add(c);
        System.out.println(">>> Đã tiếp nhận ca cấp cứu: " + c.getPatient().getName() + " vào hàng đợi.");
    }

    // Gọi ca cấp cứu tiếp theo
    public EmergencyCase getNextCase() {
        if (!cases.isEmpty()) {
            EmergencyCase nextCase = cases.poll();
            System.out.println("\n<<< BÁC SĨ BẮT ĐẦU XỬ LÝ CA CỦA: " + nextCase.getPatient().getName());
            return nextCase;
        }
        System.out.println("!!! Hiện không có ca cấp cứu nào đang chờ.");
        return null;
    }
}
