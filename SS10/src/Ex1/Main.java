package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- TÍNH TOÁN HÌNH TRÒN ---");
        System.out.print("Nhập bán kính: ");
        double radius = scanner.nextDouble();
        Shape circle = new Circle(radius);

        System.out.println("Diện tích hình tròn: " + circle.getArea());
        System.out.println("Chu vi hình tròn: " + circle.getPerimeter());
        System.out.println();

        System.out.println("--- TÍNH TOÁN HÌNH CHỮ NHẬT ---");
        System.out.print("Nhập chiều rộng: ");
        double width = scanner.nextDouble();
        System.out.print("Nhập chiều dài: ");
        double height = scanner.nextDouble();
        Shape rectangle = new Rectangle(width, height);

        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());
        System.out.println("Chu vi hình chữ nhật: " + rectangle.getPerimeter());

        scanner.close();
    }
}
