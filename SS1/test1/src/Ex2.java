import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số ngày chậm trễ (n): ");
        int n = sc.nextInt();

        System.out.print("Nhập số lượng sách mượn (m): ");
        int m = sc.nextInt();

        double total = n * m * 5000;

        if (n > 7 && m >= 3) {
            total = total * 1.2;
        }

        boolean lockCard = total > 50000;

        System.out.println("\n===== KẾT QUẢ =====");
        System.out.printf("Tổng tiền phạt: %.0f VND\n", total);
        System.out.println("Yêu cầu khóa thẻ: " + lockCard);

        sc.close();
    }
}