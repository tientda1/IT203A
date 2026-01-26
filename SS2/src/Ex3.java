import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sách trả muộn: ");
        int n = scanner.nextInt();
        long cashPunish = 0;
        int punishPerDay = 5000;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập số ngày trễ của cuốn sách thứ " + i + ": ");
            int latedDay = scanner.nextInt();
            cashPunish += (long) latedDay * punishPerDay;
        }
        System.out.println("Tổng số tiền phạt cuối cùng: " + cashPunish + " VNĐ");
    }
}