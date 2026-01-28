import java.util.Scanner;
import java.util.regex.Pattern;

public class Btth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bookId;
        String ISBN;
        int year;
        String title;
        String author;

        do {
            System.out.println("Nhập mã sách: ");
            bookId = sc.nextLine();
            if (Pattern.matches("^LIB-[0-9]{4}-S$", bookId)){
                break;
            }
            System.out.println("Vui lòng nhập mã sách đúng định dạng");
        }while(true);
        do {
            System.out.println("Nhập vào mã ISBN yêu cầu đủ 10 chữ số");
            ISBN = sc.nextLine();
            if (Pattern.matches("^[\\d]{10}", ISBN)){
                break;
            }
            System.out.println("Vui lòng nhập mã ISBN đúng định dạng");
        }while (true);
        do {
            System.out.println("Nhập năm xuất bản đủ 4 số và nhỏ hơn 2026");
            String tmp = sc.nextLine();
            if (Pattern.matches("^[\\d]{4}$", tmp) && Integer.parseInt(tmp) < 2026){

            }
            System.out.println("Vui lòng nhập năm xuất bản đúng định dạng");
        }while (true);

        title = getString(sc, "Nhập tiêu đề sách");
        author = getString(sc, "Nhập tên tác giả");
        StringBuilder rs = new StringBuilder();

    }

    private static String getString(Scanner sc, String suggest) {
        String title;
        System.out.println("Nhập tiêu đề sách: ");
        title = sc.nextLine().trim();
        String[] titleArray = title.split(" ");
        for (int i = 0; i < titleArray.length; i++){
            titleArray[i] = titleArray[i].toLowerCase();
            titleArray[i] = titleArray[i].substring(0,1).toUpperCase() + titleArray[i].substring(1);
        }
        title = String.join(" ", titleArray);
        return title;
    }
}