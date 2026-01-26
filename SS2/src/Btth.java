import java.util.Scanner;
import java.lang.*;

// 1. Viết thuật toán kiểm tra số nguyên nhập vào và in ra thông báo kết luận số nhập vào có phải số nguyên tố hay không
// 2. Tìm và in ra 100 số nguyên tố đầu tiên
// 3. Viết chương trình thực hiện menu chức năng sau :
// ------------------Menu-----------------------|
// | 1. Nhập vào số nguyên dương n              |
// | 2. Tính tổng của số chẵn và tổng số lẻ < n |
// | 3. Tìm các số hoàn hảo < n                 |
// | 4. Tính n!                                 |
// | 5. Thoát chương trình                      |
// ---------------------------------------------
public class Btth {
    public static void main(String[] args) {
        // 1.
//        int choice;
//        boolean is_prime = true;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập vào 1 số nguyên dương" );
//        choice = input.nextInt();
//        if (choice < 2) {
//            System.out.println("choice không phải số nguyên tố");
//        }
//        for (int i = 2; i <= Math.sqrt(choice); i++){
//            if (choice % i == 0){
//                is_prime = false;
//                break;
//            }
//        }
//        if (is_prime = true){
//            System.out.println(choice + " Là số nguyên tố");
//        }else{
//            System.out.println(choice + " Không phải số nguyên tố");
//        }


        //2.
//        int limit = 100;
//        int count = 0;
//        int num = 2;
//
//        System.out.println("100 số nguyên tố đầu tiên là:");
//        while (count < limit) {
//            boolean isPrime = true;
//            for (int i = 2; i <= Math.sqrt(num); i++) {
//                if (num % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.print(num + " ");
//                count++;
//            }
//            num++;
//        }

        //3.
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int choice;
        boolean isN = false;

        do {
            System.out.println("\n------------------Menu-----------------------");
            System.out.println("| 1. Nhập vào số nguyên dương n             |");
            System.out.println("| 2. Tính tổng số chẵn và tổng số lẻ < n    |");
            System.out.println("| 3. Tìm các số hoàn hảo < n                |");
            System.out.println("| 4. Tính n!                                |");
            System.out.println("| 5. Thoát chương trình                     |");
            System.out.println("---------------------------------------------");
            System.out.print("Mời bạn chọn chức năng (1-5): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Vui lòng nhập số!");
                scanner.next();
                System.out.print("Mời bạn chọn chức năng (1-5): ");
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số nguyên dương n: ");
                    n = scanner.nextInt();
                    while (n <= 0) {
                        System.out.print("n phải > 0. Nhập lại: ");
                        n = scanner.nextInt();
                    }
                    isN = true;
                    System.out.println("Đã ghi nhận n = " + n);
                    break;

                case 2:
                    if (!isN) {
                        System.out.println(">> LỖI: Bạn chưa nhập n (Chọn mục 1 trước).");
                    } else {
                        long evenSum = 0;
                        long oddSum = 0;
                        for (int i = 1; i < n; i++) {
                            if (i % 2 == 0) {
                                evenSum += i;
                            } else {
                                oddSum += i;
                            }
                        }
                        System.out.println("Tổng các số chẵn < " + n + " là: " + evenSum);
                        System.out.println("Tổng các số lẻ < " + n + " là: " + oddSum);
                    }
                    break;

                case 3:
                    if (!isN) {
                        System.out.println(">> LỖI: Bạn chưa nhập n (Chọn mục 1 trước).");
                    } else {
                        System.out.print("Các số hoàn hảo nhỏ hơn " + n + " là: ");
                        boolean isPerfectNumber = false;

                        for (int k = 1; k < n; k++) {
                            int divisorSum = 0;
                            for (int j = 1; j <= k / 2; j++) {
                                if (k % j == 0) {
                                    divisorSum += j;
                                }
                            }
                            if (divisorSum == k && k != 0) {
                                System.out.print(k + " ");
                                isPerfectNumber = true;
                            }
                        }

                        if (!isPerfectNumber) {
                            System.out.print("Không có.");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    if (!isN) {
                        System.out.println(">> LỖI: Bạn chưa nhập n (Chọn mục 1 trước).");
                    } else {
                        long giaiThua = 1;
                        for (int i = 1; i <= n; i++) {
                            giaiThua *= i;
                        }
                        System.out.println("Giai thừa " + n + "! = " + giaiThua);
                    }
                    break;

                case 5:
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Chức năng không tồn tại. Vui lòng chọn lại.");
            }

        } while (choice != 5);

        scanner.close();
    }
}



