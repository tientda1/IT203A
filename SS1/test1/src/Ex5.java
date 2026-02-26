import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên 4 chữ số: ");
        int number = sc.nextInt();
        int thousands = number / 1000;
        int hundreds  = (number / 100) % 10;
        int dozens    = (number / 10) % 10;
        int units     = number % 10;
        int sumOfFirstThreeNumber = thousands + hundreds + dozens;
        boolean isValid = (sumOfFirstThreeNumber % 10) == units;
        System.out.println("\n===== KẾT QUẢ =====");
        System.out.println("Thousands: " + thousands);
        System.out.println("Hundreds : " + hundreds);
        System.out.println("Dozens   : " + dozens);
        System.out.println("Units    : " + units);
        System.out.println("Mã hợp lệ: " + isValid);
        sc.close();
    }
}