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

public class btth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử n: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Mảng vừa nhập: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("Các số nguyên tố trong mảng: ");
        for (int i = 0; i < n; i++) {
            int val = arr[i];
            boolean isPrime = true;

            if (val < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= val; j++) {
                    if (val % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(val + " ");
            }
        }
        System.out.println();

        long sumFib = 0;
        for (int i = 0; i < n; i++) {
            int val = arr[i];
            int f0 = 0, f1 = 1;
            boolean isFib = false;

            if (val == 0 || val == 1) {
                isFib = true;
            } else {
                int nextFib = f0 + f1;
                while (nextFib <= val) {
                    if (nextFib == val) {
                        isFib = true;
                        break;
                    }
                    f0 = f1;
                    f1 = nextFib;
                    nextFib = f0 + f1;
                }
            }

            if (isFib) {
                sumFib += val;
            }
        }
        System.out.println("Tổng các số Fibonacci trong mảng: " + sumFib);

        if (n > 0) {
            int min = arr[0];
            int max = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("Giá trị nhỏ nhất (Min): " + min);
            System.out.println("Giá trị lớn nhất (Max): " + max);
        }

        long sumFactorial = 0;
        for (int i = 0; i < n; i++) {
            int val = arr[i];
            long fact = 1;

            for (int j = 1; j <= val; j++) {
                fact *= j;
            }

            sumFactorial += fact;
        }
        System.out.println("Tổng các giai thừa của từng phần tử: " + sumFactorial);
    }
}