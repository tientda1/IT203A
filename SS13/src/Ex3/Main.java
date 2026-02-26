package Ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> khoanoi1 = new ArrayList<>(Arrays.asList(101, 102, 105));
        List<Integer> khoangoai1 = new ArrayList<>(Arrays.asList(102, 105, 108));
        List<Integer> chung1 = new ArrayList<>();

        for (Integer id : khoanoi1) {
            if (khoangoai1.contains(id) && !chung1.contains(id)) {
                chung1.add(id);
            }
        }

        System.out.println(chung1);

        List<String> khoanoi2 = new ArrayList<>(Arrays.asList("DN01", "DN02", "DN03"));
        List<String> khoangoai2 = new ArrayList<>(Arrays.asList("DN02", "DN04"));
        List<String> chung2 = new ArrayList<>();

        for (String ma : khoanoi2) {
            if (khoangoai2.contains(ma) && !chung2.contains(ma)) {
                chung2.add(ma);
            }
        }

        System.out.println(chung2);
    }
}
