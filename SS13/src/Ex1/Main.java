package Ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> temperatures = new ArrayList<>(Arrays.asList(36.5, 40.2, 37.0, 12.5, 39.8, 99.9, 36.8));
        System.out.println("Danh sách ban đầu: " + temperatures);

        Iterator<Double> iterator = temperatures.iterator();
        while (iterator.hasNext()) {
            double temp = iterator.next();
            if (temp < 34.0 || temp > 42.0) {
                iterator.remove();
            }
        }

        System.out.println("Danh sách sau khi lọc: " + temperatures);

        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }

        double average = 0;
        if (!temperatures.isEmpty()) {
            average = sum / temperatures.size();
        }

        System.out.printf("Nhiệt độ trung bình: %.2f\n", average);
    }
}

