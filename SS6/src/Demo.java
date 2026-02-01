import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        // Khởi tạo đối tượng
        Student student = new Student();
        // Gán các thông tin của đối tượng
        student.studentId = "S001";
        student.fullName = "Nguyen Van A";
        student.email = "a@gmail.com";
        student.phoneNumber = "0123456789";
        student.dateOfBirth = new Date();
        // Gọi phương thức
        student.checkIn();
        student.doHomeWork();

        // Object và Instance
        Student s2 = student;
    }
}
