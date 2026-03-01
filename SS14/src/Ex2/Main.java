package Ex2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> drugCatalog = new HashMap<>();

        drugCatalog.put("T01", "Paracetamol");
        drugCatalog.put("T02", "Ibuprofen");
        drugCatalog.put("T03", "Amoxicillin");
        drugCatalog.put("T04", "Omeprazole");
        drugCatalog.put("T05", "Vitamin C");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vui lòng nhập mã thuốc: ");
        String inputCode = scanner.nextLine().trim();

        if (drugCatalog.containsKey(inputCode)) {
            String drugName = drugCatalog.get(inputCode);
            System.out.println("Tên thuốc: " + drugName);
        } else {
            System.out.println("Thuốc không tồn tại (Không có trong danh mục BHYT).");
        }

        scanner.close();
    }
}