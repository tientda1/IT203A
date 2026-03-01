package Ex3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> medicineIngredients = new HashSet<>(
                Arrays.asList("Aspirin", "Caffeine", "Paracetamol")
        );

        Set<String> patientAllergies = new HashSet<>(
                Arrays.asList("Penicillin", "Aspirin")
        );

        Set<String> allergyWarnings = new HashSet<>(medicineIngredients);

        allergyWarnings.retainAll(patientAllergies);

        Set<String> safeIngredients = new HashSet<>(medicineIngredients);

        safeIngredients.removeAll(patientAllergies);

        System.out.println("Thuốc: " + medicineIngredients);
        System.out.println("Dị ứng: " + patientAllergies);
        System.out.println("---------------------------------");

        if (!allergyWarnings.isEmpty()) {
            System.out.println("Cảnh báo dị ứng: " + allergyWarnings);
        } else {
            System.out.println("Cảnh báo dị ứng: Không có (An toàn)");
        }

        System.out.println("Thành phần an toàn: " + safeIngredients);
    }
}
