package Ex5;

public class Main {
    public static void main(String[] args) {
        Employee staff = new OfficeStaff("Nguyễn Văn A", 10000000);
        Employee manager = new Manager("Trần Thị B", 20000000, 5000000);

        System.out.println("=== BẢNG LƯƠNG NHÂN VIÊN ===");

        System.out.println("Nhân viên: " + staff.getName());
        System.out.println(" - Chế độ thưởng KPI: Không có");
        System.out.println(" - Thực lãnh: " + staff.calculateSalary() + " VNĐ\n");

        System.out.println("Quản lý: " + manager.getName());
        System.out.println(" - Chế độ thưởng KPI: " + ((Manager) manager).getBonus() + " VNĐ");
        System.out.println(" - Thực lãnh: " + manager.calculateSalary() + " VNĐ");
    }
}
