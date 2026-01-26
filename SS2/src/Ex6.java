import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxBorrowings = Integer.MIN_VALUE;
        int minBorrowings = Integer.MAX_VALUE;
        int totalBorrowings = 0;
        int activeDays = 0;
        System.out.println("--- WEEKLY BORROWING STATISTICS ---");
        System.out.println("Enter borrowing count for each day (0 = Closed).");
        for (int day = 1; day <= 7; day++) {
            System.out.print("Day " + day + ": ");
            int dailyCount = scanner.nextInt();
            if (dailyCount == 0) {
                System.out.println("  (Library closed/No data. Skipping...)");
                continue;
            }
            if (dailyCount > maxBorrowings) {
                maxBorrowings = dailyCount;
            }
            if (dailyCount < minBorrowings) {
                minBorrowings = dailyCount;
            }
            totalBorrowings += dailyCount;
            activeDays++;
        }

        System.out.println("\n---------------------------------");
        if (activeDays > 0) {
            double averageBorrowings = (double) totalBorrowings / activeDays;

            System.out.println("Highest Borrowings (Cao nhất): " + maxBorrowings);
            System.out.println("Lowest Borrowings (Thấp nhất): " + minBorrowings);
            System.out.printf("Average Borrowings (Trung bình): %.2f\n", averageBorrowings);
        } else {
            System.out.println("No data available (Library was closed all week).");
        }

        scanner.close();
    }
}