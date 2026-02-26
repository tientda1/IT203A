import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bookID;
        String bookName;
        int publishYear;
        double price;
        boolean isAvailable;

        System.out.print("Nhập mã sách: ");
        bookID = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        bookName = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        publishYear = sc.nextInt();

        System.out.print("Nhập giá sách: ");
        price = sc.nextDouble();

        System.out.print("Sách còn trong kho? (true/false): ");
        isAvailable = sc.nextBoolean();

        int bookAge = 2026 - publishYear;

        String status = isAvailable ? "Còn sách" : "Đã mượn";

        System.out.println("\n===== PHIẾU THÔNG TIN SÁCH =====");
        System.out.println("Mã sách: " + bookID);
        System.out.println("Tên sách: " + bookName.toUpperCase());
        System.out.println("Năm xuất bản: " + publishYear);
        System.out.println("Tuổi thọ sách: " + bookAge + " năm");
        System.out.printf("Giá tiền: %.2f VND\n", price);
        System.out.println("Tình trạng: " + status);

        sc.close();
    }
}