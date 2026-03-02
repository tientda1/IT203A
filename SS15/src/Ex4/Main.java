package Ex4;

public class Main {
    public static void main(String[] args) {
        EmergencyQueue clinic = new EmergencyQueue();

        System.out.println("=== TIẾP NHẬN BỆNH NHÂN ĐẦU GIỜ ===");
        // 1. Hai bệnh nhân thông thường đến trước
        clinic.addPatient(new EmergencyPatient("BN01", "Nguyễn Văn A", 2)); // Đến lúc 08:00
        clinic.addPatient(new EmergencyPatient("BN02", "Trần Thị B", 2)); // Đến lúc 08:10

        // 2. Một bệnh nhân cấp cứu được đưa vào sau
        clinic.addPatient(new EmergencyPatient("BN03", "Lê Văn C (Tai nạn)", 1)); // Đến lúc 08:15

        // 3. Một bệnh nhân thông thường khác đến sau
        clinic.addPatient(new EmergencyPatient("BN04", "Phạm Văn D", 2)); // Đến lúc 08:20

        // 4. Bệnh nhân cấp cứu thứ 2 đến
        clinic.addPatient(new EmergencyPatient("BN05", "Hoàng Thị E (Khó thở)", 1)); // Đến lúc 08:25

        // Hiển thị danh sách hiện tại
        clinic.displayQueue();

        System.out.println("=== BÁC SĨ BẮT ĐẦU KHÁM ===");

        // Gọi khám 3 lần liên tiếp để xem hệ thống ưu tiên ra sao
        clinic.callNextPatient(); // Sẽ gọi BN03 (Cấp cứu đến trước)
        clinic.callNextPatient(); // Sẽ gọi BN05 (Cấp cứu đến sau)
        clinic.callNextPatient(); // Sẽ gọi BN01 (Thông thường đến đầu tiên - FIFO)

        // Hiển thị danh sách những người còn lại
        clinic.displayQueue();
    }
}
