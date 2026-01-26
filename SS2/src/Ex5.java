import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reputationScore = 100;
        int daysOverdue = 0;

        System.out.println("--- READER RATING SYSTEM ---");
        System.out.println("Enter days overdue (<= 0 for on time).");
        System.out.println("Enter 999 to exit.");

        while (true) {
            System.out.print(">> Enter data: ");
            daysOverdue = scanner.nextInt();

            if (daysOverdue == 999) {
                break;
            }

            if (daysOverdue <= 0) {
                reputationScore += 5;
                System.out.println("   (On time: +5. Current Score: " + reputationScore + ")");
            } else {
                int penaltyPoints = daysOverdue * 2;
                reputationScore -= penaltyPoints;
                System.out.println("   (Late " + daysOverdue + " days: -" + penaltyPoints + ". Current Score: " + reputationScore + ")");
            }
        }
        System.out.println("\n---------------------------------");
        System.out.println("FINAL REPUTATION SCORE: " + reputationScore);
        System.out.print("STATUS: ");

        if (reputationScore > 120) {
            System.out.println("VIP Reader (Độc giả Thân thiết)");
        } else if (reputationScore >= 80) {
            System.out.println("Standard Reader (Độc giả Tiêu chuẩn)");
        } else {
            System.out.println("Restricted Reader (Độc giả cần lưu ý)");
        }

        scanner.close();
    }
}