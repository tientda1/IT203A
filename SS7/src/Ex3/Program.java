package Ex3;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        double[] myScores = {6.5, 8.0, 4.5};

        System.out.println("Danh sách điểm: " + Arrays.toString(myScores));
        System.out.println("\n>> Kết quả xử lý:");

        double average = ScoreUtils.calculateAverage(myScores);

        System.out.printf("- Điểm trung bình cả lớp: %.2f\n", average);

        for (double score : myScores) {
            boolean isPassed = ScoreUtils.checkPass(score);

            String status = isPassed ? "Đạt" : "Trượt";
            System.out.println("- Điểm " + score + ": " + status);
        }
    }
}
