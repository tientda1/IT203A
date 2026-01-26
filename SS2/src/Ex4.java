import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id;
        do {
            System.out.print("Nhập mã ID sách (số nguyên > 0): ");
            id = scanner.nextInt();
            if (id <= 0) {
                System.out.println("Mã không hợp lệ, hãy nhập lại!");
            }
        } while (id <= 0);
        System.out.println("Lưu mã sách thành công. Mã ID là: " + id);
    }
}