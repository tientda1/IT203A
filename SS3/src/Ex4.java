import java.util.Random;

public class Ex4 {
    public static void sortBooks(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void displayBooks(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100); // số từ 0 đến 99
        }
        System.out.println("Mảng trước khi sắp xếp:");
        displayBooks(arr);
        sortBooks(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        displayBooks(arr);
    }
}