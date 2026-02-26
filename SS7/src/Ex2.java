class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }
}

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("=== 1. THỬ NGHIỆM VỚI KIỂU NGUYÊN THỦY (INT) ===");
        int numberA = 10;

        int numberB = numberA;

        System.out.println("Ban đầu:");
        System.out.println("Number A: " + numberA);
        System.out.println("Number B: " + numberB);

        System.out.println("\n Đang thay đổi numberB thành 99...");
        numberB = 99;

        System.out.println("Kết quả sau khi thay đổi B:");
        System.out.println("Number A (Gốc): " + numberA);
        System.out.println("Number B (Mới): " + numberB);
        System.out.println("=> KẾT LUẬN: Thay đổi B KHÔNG ảnh hưởng A.");


        System.out.println("\n\n=== 2. THỬ NGHIỆM VỚI KIỂU THAM CHIẾU (OBJECT) ===");
        Ex4 student1 = new Ex4("Nguyen Van A");

        Ex4 student2 = student1;

        System.out.println("Ban đầu:");
        System.out.println("Ex4 1: " + student1.name);
        System.out.println("Ex4 2: " + student2.name);

        System.out.println("\nĐang thay đổi tên của student2 thành 'Tran Thi B'...");
        student2.name = "Tran Thi B";

        // Quan sát kết quả
        System.out.println("Kết quả sau khi thay đổi Ex4 2:");
        System.out.println("Ex4 1 (Gốc): " + student1.name);
        System.out.println("Ex4 2 (Mới): " + student2.name);
        System.out.println("Thay đổi Ex4 2 làm thay đổi cả Ex4 1.");
    }
}