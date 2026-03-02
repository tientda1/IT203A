package Ex3;

public class Main {
    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();

        String[] process1 = {"PUSH", "PUSH", "POP", "POP"};
        System.out.println("=== KỊCH BẢN 1 ===");
        checker.checkProcess(process1);
        System.out.println("\n");

        String[] process2 = {"PUSH", "POP", "POP"};
        System.out.println("=== KỊCH BẢN 2 ===");
        checker.checkProcess(process2);
        System.out.println("\n");

        String[] process3 = {"PUSH", "PUSH", "POP"};
        System.out.println("=== KỊCH BẢN 3 ===");
        checker.checkProcess(process3);
    }
}
