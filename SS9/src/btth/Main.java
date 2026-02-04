// Btth
// Class : Shape
// Thuộc tính : chu vi và diện tích
// Phương thức : tính chu vi và diện tích

// Class con kế thừa shape
// Rectangle : chiều dài , chiều rộng
// Triangle : 3 cạnh a,b,c
// Circle : bán kính

// Bài toán : Khởi tạo 1 mảng các hình học ngẫu nhiên 10 hình
// 1. Duyệt và in ra thông tin chi tiết của từng hình
// 2. Thống kê số lượng của mỗi loại hình

package btth;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape[] danhSachHinh = new Shape[10];
        Random rand = new Random();

        for (int i = 0; i < danhSachHinh.length; i++) {
            int loai = rand.nextInt(3);

            switch (loai) {
                case 0:
                    double dai = 1 + rand.nextInt(10);
                    double rong = 1 + rand.nextInt(10);
                    danhSachHinh[i] = new Rectangle(dai, rong);
                    break;
                case 1:
                    double a = 3 + rand.nextInt(10);
                    double b = 3 + rand.nextInt(10);
                    double c = (a + b) / 2 + 1;
                    danhSachHinh[i] = new Triangle(a, b, c);
                    break;
                case 2:
                    double r = 1 + rand.nextInt(10);
                    danhSachHinh[i] = new Circle(r);
                    break;
            }
        }

        System.out.println("=== DANH SÁCH CHI TIẾT ===");
        for (Shape s : danhSachHinh) {
            System.out.println(s.toString());
        }

        int countRect = 0;
        int countTri = 0;
        int countCircle = 0;

        for (Shape s : danhSachHinh) {
            if (s instanceof Rectangle) countRect++;
            else if (s instanceof Triangle) countTri++;
            else if (s instanceof Circle) countCircle++;
        }

        System.out.println("\n=== THỐNG KÊ SỐ LƯỢNG ===");
        System.out.println("Rectangle : " + countRect);
        System.out.println("Triangle  : " + countTri);
        System.out.println("Circle    : " + countCircle);
    }
}
