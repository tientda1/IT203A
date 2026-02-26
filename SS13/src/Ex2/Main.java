package Ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> danhsachnhap = new ArrayList<>(Arrays.asList("Paracetamol", "Ibuprofen", "Panadol", "Paracetamol", "Aspirin", "Ibuprofen"));
        List<String> danhsachduynhat = new ArrayList<>();

        for (String thuoc : danhsachnhap) {
            if (!danhsachduynhat.contains(thuoc)) {
                danhsachduynhat.add(thuoc);
            }
        }

        Collections.sort(danhsachduynhat);

        System.out.println("Input: " + danhsachnhap);
        System.out.println("Output: " + danhsachduynhat);
    }
}
