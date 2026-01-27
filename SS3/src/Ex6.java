public class Ex6 {
    public static int[] mergeBooks(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] temp = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                temp[k++] = a[i++];
            } else if (a[i] > b[j]) {
                temp[k++] = b[j++];
            } else {
                // a[i] == b[j] → chỉ lấy 1
                temp[k++] = a[i];
                i++;
                j++;
            }
        }
        while (i < a.length) {
            temp[k++] = a[i++];
        }
        while (j < b.length) {
            temp[k++] = b[j++];
        }
        int[] arrayMerge = new int[k];
        for (int x = 0; x < k; x++) {
            arrayMerge[x] = temp[x];
        }
        return arrayMerge;
    }
    public static void displayBooks(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arrayFirst = {101, 103, 105, 107};
        int[] arraySecond = {102, 103, 106, 107, 108};
        System.out.println("Danh sách sách thư viện 1:");
        displayBooks(arrayFirst);
        System.out.println("Danh sách sách thư viện 2:");
        displayBooks(arraySecond);
        int[] arrayMerge = mergeBooks(arrayFirst, arraySecond);
        System.out.println("Danh sách sách hoàn chỉnh của thư viện:");
        displayBooks(arrayMerge);
    }
}