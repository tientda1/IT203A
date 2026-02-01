import java.util.Scanner;

public class Ex1 {
    static String normalizeSpaces(String s) {
        return s.trim().replaceAll("\\s+", " ");
    }
    static String capitalizeWords(String s) {
        s = normalizeSpaces(s).toLowerCase();
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(Character.toUpperCase(words[i].charAt(0)))
                    .append(words[i].substring(1))
                    .append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        String title = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        String author = sc.nextLine();

        title = normalizeSpaces(title).toUpperCase();
        author = capitalizeWords(author);

        System.out.printf("[%s] - Tác giả: %s\n", title, author);
    }
}