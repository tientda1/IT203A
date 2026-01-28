import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex5 {
    public static void main(String[] args) {

        String[] logs = {
                "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345",
                "2024-05-21 | User: TranVanB  | Action: RETURN | BookID: BK54321",
                "2024-05-22 | User: LeThiC   | Action: BORROW | BookID: BK11111"
        };

        String regex = "(\\d{4}-\\d{2}-\\d{2}) \\| User: (\\w+) \\| Action: (\\w+) \\| BookID: (\\w+)";

        Pattern pattern = Pattern.compile(regex);

        int borrowCount = 0;
        int returnCount = 0;

        for (int i = 0; i < logs.length; i++) {
            Matcher matcher = pattern.matcher(logs[i]);

            if (matcher.find()) {
                String date = matcher.group(1);
                String user = matcher.group(2);
                String action = matcher.group(3);
                String bookID = matcher.group(4);

                System.out.printf("Ngày: %s\n", date);
                System.out.printf("Người dùng: %s\n", user);
                System.out.printf("Hành động: %s\n", action);
                System.out.printf("Mã sách: %s\n\n", bookID);

                if (action.equals("BORROW")) borrowCount++;
                if (action.equals("RETURN")) returnCount++;
            }
        }

        System.out.printf("Tổng BORROW: %d\n", borrowCount);
        System.out.printf("Tổng RETURN: %d\n", returnCount);
    }
}