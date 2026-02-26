import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá sách (USD): ");
        double priceUSD = sc.nextDouble();

        System.out.print("Nhập tỷ giá (VND): ");
        float exchangeRate = sc.nextFloat();

        double totalVND = priceUSD * exchangeRate;

        long roundedVND = (long) totalVND;

        System.out.println("\n===== KẾT QUẢ =====");
        System.out.println("Tổng tiền (double): " + totalVND);
        System.out.println("Tổng tiền sau khi ép kiểu (long): " + roundedVND + " VND");

        sc.close();
    }
}