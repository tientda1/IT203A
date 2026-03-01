package Ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Patient {
    String name;
    int age;
    String department;

    public Patient(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Patient(" + name + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = Arrays.asList(
                new Patient("Lan", 30, "Tim mạch"),
                new Patient("Hùng", 45, "Nội tiết"),
                new Patient("Mai", 25, "Tim mạch")
        );

        Map<String, List<Patient>> departmentMap = new HashMap<>();

        for (Patient p : patients) {
            departmentMap.computeIfAbsent(p.department, k -> new ArrayList<>()).add(p);
        }

        System.out.println("--- DANH SÁCH BỆNH NHÂN THEO KHOA ---");
        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            System.out.println("Key \"" + entry.getKey() + "\" -> Value " + entry.getValue());
        }

        System.out.println("\n--- THỐNG KÊ QUÁ TẢI ---");

        String overloadedDept = "";
        int maxPatients = 0;

        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            int currentSize = entry.getValue().size();

            if (currentSize > maxPatients) {
                maxPatients = currentSize;
                overloadedDept = entry.getKey();
            }
        }

        if (!overloadedDept.isEmpty()) {
            System.out.println("Khoa " + overloadedDept + " đang đông nhất (" + maxPatients + " bệnh nhân).");
        }
    }
}
