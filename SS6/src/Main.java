public class Main {
    public static void main(String[] args) {
        System.out.println("=== HỆ THỐNG QUẢN LÝ NHÂN VIÊN ===");

        Employee emp1 = new Employee();
        System.out.print("\nTrường hợp 1 (Mặc định):");
        emp1.displayInfo();

        Employee emp2 = new Employee("NV01", "Nguyễn Văn A");
        System.out.print("\nTrường hợp 2 (ID + Tên):");
        emp2.displayInfo();

        Employee emp3 = new Employee("NV02", "Trần Thị B", 2500.0);
        System.out.print("\nTrường hợp 3 (Đầy đủ):");
        emp3.displayInfo();
    }
}