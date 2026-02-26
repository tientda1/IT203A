public class Ex1 {
    private String StudentId;
    private String name;
    public static int totalEx1 = 0;

    public Ex1(String Ex1Id, String name) {
        this.StudentId = Ex1Id;
        this.name = name;
        totalEx1++;
    }

    public void displayInfo() {
        System.out.println("---------------------------");
        System.out.println("Mã SV:  " + this.StudentId);
        System.out.println("Tên SV: " + this.name);
    }

    public static void showTotalInfo() {
        System.out.println("===========================");
        System.out.println("TỔNG SỐ SINH VIÊN ĐÃ TẠO: " + totalEx1);
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        System.out.println("Ban đầu:");
        Ex1.showTotalInfo();

        Ex1 s1 = new Ex1("SV001", "Nguyen Van A");
        s1.displayInfo();
        Ex1 s2 = new Ex1("SV002", "Tran Thi B");
        s2.displayInfo();
        Ex1 s3 = new Ex1("SV003", "Le Van C");
        s3.displayInfo();

        System.out.println("\nSau khi nhập dữ liệu:");
        Ex1.showTotalInfo();
    }
}
