import java.util.Scanner;

public class BMI_Caculate {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào cân nặng: ");
        float weight = input.nextFloat();
        System.out.print("Nhập vào chiều cao (m): ");
        float height = input.nextFloat();
        float bmi = weight / (height * height);
        System.out.printf("Chỉ số BMI của bạn là: %.2f\n", bmi);
        if (bmi < 18.5) {
            System.out.println("Gầy");
        } else if (bmi >= 18.5 && bmi < 22.5) {
            System.out.println("Bình thường");
        }else if (bmi >= 22.5){
            System.out.println("NDPT");
        }
    }
}
