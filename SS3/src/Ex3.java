public class Ex3 {
    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        if (names == null || quantities == null || names.length != quantities.length) {
            System.out.println("Dữ liệu không hợp lệ");
            return;
        }
        int max = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > max) {
                max = quantities[i];
            }
        }
        System.out.println("Sách có số lượng lớn nhất (" + max + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println("- " + names[i] + ": " + quantities[i]);
            }
        }
    }
    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        if (names == null || quantities == null || names.length != quantities.length) {
            System.out.println("Dữ liệu không hợp lệ");
            return;
        }
        int min = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < min) {
                min = quantities[i];
            }
        }
        System.out.println("Sách có số lượng nhỏ nhất (" + min + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println("- " + names[i] + ": " + quantities[i]);
            }
        }
    }
    public static void main(String[] args) {
        String[] names = {
                "Java cơ bản",
                "Lập trình C",
                "Python nâng cao",
                "Java cơ bản",
                "Cấu trúc dữ liệu"
        };
        int[] quantities = {10, 5, 10, 3, 5};
        maxQuantityOfBooks(names, quantities);
        System.out.println();
        minQuantityOfBooks(names, quantities);
    }
}