public class Ex4 {
    public static double classFund = 0;

    private String name;
    public Ex4(String name) {
        this.name = name;
    }

    public void contribute(double amount) {
        classFund += amount;
        System.out.println("Sinh viên " + this.name + " đã đóng: " + amount + " VNĐ");
    }

    public static void showTotalFund() {
        System.out.println("-----------------------------------------");
        System.out.println(">>> TỔNG QUỸ LỚP HIỆN TẠI: " + classFund + " VNĐ");
        System.out.println("-----------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("Bắt đầu năm học:");
        Ex4.showTotalFund();

        Ex4 s1 = new Ex4("Nguyen Van A");
        Ex4 s2 = new Ex4("Tran Thi B");
        Ex4 s3 = new Ex4("Le Van C");

        s1.contribute(50000);
        s2.contribute(100000);
        s3.contribute(20000);

        System.out.println("Cuối ngày:");
        Ex4.showTotalFund();

        System.out.println("S1 nhìn thấy quỹ là: " + s1.classFund);
        System.out.println("S2 nhìn thấy quỹ là: " + s2.classFund);
    }
}