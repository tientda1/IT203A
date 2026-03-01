package Ex4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        List<String> reportedCases = Arrays.asList(
                "Cúm A", "Sốt xuất huyết", "Cúm A",
                "Covid-19", "Cúm A", "Sốt xuất huyết"
        );

        Map<String, Integer> diseaseStatistics = new TreeMap<>();

        for (String disease : reportedCases) {
            if (diseaseStatistics.containsKey(disease)) {
                int currentCount = diseaseStatistics.get(disease);
                diseaseStatistics.put(disease, currentCount + 1);
            } else {
                diseaseStatistics.put(disease, 1);
            }
        }

        System.out.println("BÁO CÁO SỐ CA BỆNH TRONG NGÀY:");
        for (Map.Entry<String, Integer> entry : diseaseStatistics.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}
