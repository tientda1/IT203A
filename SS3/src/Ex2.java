import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        char section;
        Scanner sc = new Scanner(System.in);
        section = sc.nextLine().charAt(0);
        System.out.println("Nhap ma khu vuc (A, B, C, D): ");
        switch (section) {
            case 'A':
                System.out.println("Vi tri: Tang 1 - Sach Van hoc");
                break;
            case 'B':
                System.out.println("Vi tri: Tang 2 - Sach Khoa Hoc");
                break;
            case 'C':
                System.out.println("Vi tri: Tang 3: Sach Ngoai ngu");
                break;
            case 'D':
                System.out.println("Vi tri: Tang 4: Sach Tin hoc");
                break;
            default:
                System.out.println("Ma khu vuc khong hop le!");
        }
    }
}