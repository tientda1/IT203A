public class ArrayDemo {
    public static void main(String[] args) {
        // Khai báo mảng
        int[] arrayInt;

        Object[] arrayObject;
        //Cấp phát bộ nhớ cho mảng
        arrayInt = new int[5];
        arrayObject = new Object[3];
        //Khởi tạo mảng

        arrayInt[0] = 10;
        arrayInt[1] = 20;
        arrayInt[2] = 30;
        arrayInt[3] = 40;
        arrayInt[4] = 50;

        arrayObject[0] = "Hello" ;
        arrayObject[1] = 123;
        arrayObject[2] = true;

        //Kiểm tra độ dài mảng
        System.out.println("Độ dài mảng arrayInt: " + arrayInt.length);

        //Duyệt mảng: thuật toán tìm kiếm tuần tự
        // for i : duyệt mảng theo chỉ số
        // for each: duyệt mảng theo giá trị
        // Duyệt mảng để tìm ra số lớn nhất
        int max = arrayInt[0];
        for (int i = 0; i < arrayInt.length ; i++) {
            if (arrayInt[i] > max){
                max = arrayInt[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng arrayInt" + max);

        //for each : Duyệt mảng theo giá trị


        //Kỹ thuật lập trình
        // count, sum, multi, average,min, max, flag, search
        // Đếm số lượng phần tử trong 1 danh sách cho trước
        // Tính tổng các phần tử trong mảng số
        // Tính min, max trong 1 danh sách
        // Khi bài toán yêu cầu kiểm tra kết quả là có hay không mà cần xảy ra điều kiện if ở trong vòng lặp ít nhất 1 lần



    }
}
