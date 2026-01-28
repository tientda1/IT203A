import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thẻ độc giả: ");
        String cardID = sc.nextLine();

        String regex = "^[A-Z]{2}(19|20)\\d{2}\\d{5}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cardID);

        if (matcher.matches()) {
            System.out.println("Mã thẻ hợp lệ!");
        } else {
            if (!cardID.matches("^[A-Z]{2}.*")) {
                System.out.println("Thiếu tiền tố 2 chữ cái in hoa!");
            } else if (!cardID.substring(2, 6).matches("(19|20)\\d{2}")) {
                System.out.println("Năm không hợp lệ!");
            } else if (!cardID.matches("^[A-Z]{2}(19|20)\\d{2}\\d{5}$")) {
                System.out.println("5 chữ số cuối không hợp lệ!");
            } else {
                System.out.println("Mã thẻ sai định dạng!");
            }
        }
    }
}