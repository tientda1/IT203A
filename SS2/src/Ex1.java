import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();

        System.out.print("Nhập số sách đang giữ: ");
        int numBook = scanner.nextInt();

        if (age >= 18 && numBook < 3) {
            System.out.println("Cho phép mượn sách");
        } else {
            if (age < 18) {
                System.out.println("Lý do: Bạn chưa đủ tuổi (cần từ 18 tuổi trở lên).");
            }
            if (numBook >= 3) {
                System.out.println("Lý do: Bạn đã mượn quá số lượng cho phép (phải ít hơn 3 cuốn).");
            }
        }

    }
}