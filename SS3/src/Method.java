import java.util.Scanner;

public class Method {
    // Phương thức : Hàm, thủ tục
    // Tính ổng 2 số thực và trả về kết quả
    public double sum(double a, double b){
        return a+b;
    }
    public static void main(String[] args) { //Vùng nhớ tĩnh
        Scanner input = new Scanner(System.in); // Cấp phát động
        input.nextInt();
//        double rs = sum(a:1, b:2);
//        System.out.println("Kết quả: " + rs);

        Method method = new Method(); // Phải cấp phát động
        double rs = method.sum(a: 1, b: 2);
        System.out.println("Kết quả : " + rs);
    }
}
