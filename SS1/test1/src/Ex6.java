import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ tự cuốn sách (stt): ");
        int stt = sc.nextInt();
        int shelf = (stt - 1) / 25 + 1;
        int position = (stt - 1) % 25 + 1;
        String area = (shelf <= 10) ? "Khu Cận" : "Khu Viễn";
        System.out.println(
                "Kệ số " + shelf +
                        " - Vị trí " + position +
                        " - Khu vực " + area
        );
        sc.close();
    }
}