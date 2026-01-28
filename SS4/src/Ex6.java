import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex6 {
    public static void main(String[] args) {

        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc. Tôi cảm thấy thật ngu khi đã mua nó. Thật là một trải nghiệm ngốc nghếch. Tôi không bao giờ muốn đọc lại cuốn sách ngu này nữa! Nó làm tôi cảm thấy tệ hại và thất vọng. Thật là một sự lãng phí thời gian và tiền bạc. Tôi khuyên mọi người đừng bao giờ đọc cuốn sách ngu ngốc này. Nó chỉ làm bạn cảm thấy tệ hơn mà thôi.";

        String[] blacklist = {"tệ", "ngu", "ngốc", "ngu ngốc"};

        // Tạo regex blacklist
        StringBuilder regex = new StringBuilder("(?i)");
        for (int i = 0; i < blacklist.length; i++) {
            regex.append(Pattern.quote(blacklist[i]));
            if (i < blacklist.length - 1) regex.append("|");
        }

        Pattern pattern = Pattern.compile(regex.toString());
        Matcher matcher = pattern.matcher(review);

        // Thay thế bằng dấu * theo độ dài
        StringBuilder result = new StringBuilder();
        int last = 0;

        while (matcher.find()) {
            result.append(review, last, matcher.start());

            int len = matcher.group().length();
            for (int i = 0; i < len; i++) result.append("*");

            last = matcher.end();
        }
        result.append(review.substring(last));

        // Cắt ngắn nếu quá 200 ký tự
        String finalReview = result.toString();

        if (finalReview.length() > 200) {
            int cut = finalReview.lastIndexOf(" ", 200);
            if (cut == -1) cut = 200;
            finalReview = finalReview.substring(0, cut) + "...";
        }

        System.out.println("Review sau khi xử lý: " + finalReview);
    }
}