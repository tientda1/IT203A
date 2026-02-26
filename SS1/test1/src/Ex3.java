public class Ex3 {
    public static void main(String[] args) {
        // Hai biến String ban đầu
        String book1 = "Java Basic";
        String book2 = "Python Intro";
        /*
         * LÚC NÀY TRONG BỘ NHỚ:
         *
         * STACK:
         * book1 ----> tham chiếu tới "Java Basic"
         * book2 ----> tham chiếu tới "Python Intro"
         *
         * HEAP:
         * "Java Basic"
         * "Python Intro"
         */

        // Biến tạm để hoán đổi
        String temp = book1;

        /*
         * STACK:
         * temp  ----> "Java Basic"
         * book1 ----> "Java Basic"
         * book2 ----> "Python Intro"
         *
         * HEAP:
         * Không tạo chuỗi mới, chỉ thêm tham chiếu
         */

        book1 = book2;

        /*
         * STACK:
         * book1 ----> "Python Intro"
         * book2 ----> "Python Intro"
         * temp  ----> "Java Basic"
         *
         * HEAP:
         * "Java Basic"
         * "Python Intro"
         */

        book2 = temp;

        /*
         * STACK:
         * book1 ----> "Python Intro"
         * book2 ----> "Java Basic"
         *
         * HEAP:
         * "Java Basic"
         * "Python Intro"
         *
         * Chỉ thay đổi THAM CHIẾU trên Stack
         *  Dữ liệu chuỗi trên Heap KHÔNG bị thay đổi
         */

        // In kết quả
        System.out.println("Book 1: " + book1);
        System.out.println("Book 2: " + book2);
    }
}