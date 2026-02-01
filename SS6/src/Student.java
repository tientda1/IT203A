import java.util.Date;

public class Student {
    String studentId;
    String fullName;
    Date dateOfBirth;
    String email;
    String phoneNumber;



    //Phương thức
    // Phương thức khởi tạo: constructor là 1 phương thức đặc biệt dùng để khởi tạo đối tượng
    public Student(){
        studentId = "S001";
        fullName = "Nguyen Van A";
        email = "a@gmail.com";
        phoneNumber = "0123456789";
        dateOfBirth = new Date();// Ngày hiện tại
    }

    public Student(String studentIdIn, String fullNameIn, String emailIn, String phoneNumberIn){
        this.studentId = studentId;
        fullName = fullNameIn;
        email = emailIn;
        phoneNumber = phoneNumberIn;
        dateOfBirth = new Date();
    }

    void checkIn(){
        System.out.println("Student" + fullName + "checked in at" + new Date());
    }
    void doHomeWork(){
        System.out.println("Student" + fullName + "is doing homework");
    }
}
