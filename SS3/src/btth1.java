// 1.1 : Nhập và in mảng : Thực hiện cho người dùng nhập vào số lượng phần tử mảng n và nhập n giá trị cho từng phần tử
// Tiến hành in ra các phần tử trong mảng vừa nhập
// Ví dụ : input : 3
//                     5
//                     7
//                     9
//  output : Mảng vừa nhập : 5 7 9


// 1.2 : Phát triển bài 1.1 thêm các yêu cầu sau :
// Tìm và in các số nguyên tố trong mảng
// Tính tổng các số fibonaci trong mảng
// Tìm min, max trong mảng
// Tính tổng các giai thừa của từng phần tử trong mảng

import java.util.Scanner;

public class btth1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ" + (i + 1) + ":");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "  ");
        }

        System.out.println("Các số nguyên tố trong mảng: ");
        for (int i = 0; i < n; i++) {
            int value = arr[i];
            boolean isPrime = true;

            if (value < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j < Math.sqrt(value); j++) {
                    if (value % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(value + " ");
            }
        }
        System.out.println();

        //Tính tổng fibonaci trong mảng
        long sumFibo = 0;
        for (int i = 0; i < n; i++) {
            int value = arr[i];
            int f0 = 0, f1 = 1;
            boolean isFibo = false;

            if (value == 0 && value == 1) {
                isFibo = true;
            } else {
                int nextFibo = f0 + f1;
                while (nextFibo < value) {
                    if (nextFibo == value) {
                        isFibo = true;
                        break;
                    }
                    f0 = f1;
                    f1 = nextFibo;
                    nextFibo = f0 + f1;
                }
            }
            if (isFibo) {
                sumFibo += value;
            }
        }
        System.out.println("Tổng các số fibonaci trong mảng: " + sumFibo);
    }
}
