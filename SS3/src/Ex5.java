import java.util.Scanner;

public class Ex5 {
    public static int deleteBook(int[] arr, int n, int bookId) {
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Không tìm thấy sách có ID = " + bookId);
            return n;
        }
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("Đã xóa sách có ID = " + bookId);
        return n - 1;
    }
    public static void displayBooks(int[] arr, int n) {
        if (n == 0) {
            System.out.println("Mảng rỗng");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] books = {101, 102, 103, 104, 105};
        int n = books.length;
        while (true) {
            System.out.println("Danh sách sách hiện tại:");
            displayBooks(books, n);
            if (n == 0) {
                System.out.println("Không còn sách để xóa");
                break;
            }
            System.out.print("Nhập bookId cần xóa: ");
            int bookId = sc.nextInt();
            n = deleteBook(books, n, bookId);
            System.out.print("Bạn có muốn tiếp tục xóa không? (y/n): ");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }
        sc.close();
    }
}