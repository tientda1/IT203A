public class Main {
    public static void main(String[] args) {
        int number = 10;

        // If-Else Statement
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else {
            System.out.println(number + " is not a positive number.");
        }

        // Switch Statement
        int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("The day is: " + dayName);

        // Dạng bài
        /*
        1. Tìm và in ra các số nguyên tố từ 1 đến 100. - if
        2. Nhập 1 số nguyên thỏa mãn các điều kiện :
            - Số nguyên dương
            - Số chẵn
            - Lớn hơn 100
            Nếu không thỏa mãn điều kiện nào thì in ra lỗi tương ứng. - if
        3. Phân loại học lực dựa trên điểm trung bình:
            - 9-10: Xuất sắc
            - 8-8.9: Giỏi
            - 7-7.9: Khá
            - 5-6.9: Trung bình
            - Dưới 5: Yếu
            -- if esle if
        4. Kiểm tra năm nhuận:
            - Năm nhuận là năm chia hết cho 4 nhưng không chia hết cho 100
            - Hoặc năm chia hết cho 400
            -- if else
         */
    }
}