package Ex4;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> hangdoi = new LinkedList<>();

        hangdoi.addLast("Đang khám: A");
        hangdoi.addLast("Đang khám: B");

        hangdoi.addFirst("Đang cấp cứu: C");

        System.out.println(hangdoi.removeFirst());
        System.out.println(hangdoi.removeFirst());
        System.out.println(hangdoi.removeFirst());
    }
}
