import java.util.Scanner;

public class Ex1 {
    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] books = new int[n];
        System.out.println("--- Bắt đầu nhập mã sách ---");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập mã sách thứ " + (i + 1) + ": ");
            books[i] = sc.nextInt();
        }
        return books;
    }
    public static void displayLibraries(int[] arr) {
        System.out.print("Danh sách mã sách hiện có: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sách cần thêm (n): ");
        int n = sc.nextInt();
        int[] isbnList = addBookToLibraries(n);

        System.out.println("\n--- Kết quả kiểm kê ---");
        displayLibraries(isbnList);
    }
}