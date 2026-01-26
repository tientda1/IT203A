import java.util.Arrays;

public class IterativeStatement {
    public static void main(String[] args) {
//        for (int i = 10, j = 100; i<100 ; i = i+10, j= j-10) {
//            System.out.println("i = " + i + ", j = " + j);
//        }
//
//        boolean isCheck = true;
//        while (isCheck) {
//            System.out.println("Inside While Loop");
//            isCheck = false;
//        }
//
//        do {
//            System.out.println("Inside Do-While Loop");
//        }while(isCheck);

        // Dạng bài: Nhập 1 chuỗi từ người dùng :
        // Nếu chuỗi rỗng hoặc chỉ có khoảng trắng thì yêu cầu nhập lại
        // Ngược lại in ra chuỗi vừa nhập và thoát chương trình

        //foreach : vòng lặp duyệt qua từng phần tử của 1 danh sách
        int[] arr = {10,20,30,40} ;
        for (int element: arr) {
            System.out.println(element);
        }

    }
}
