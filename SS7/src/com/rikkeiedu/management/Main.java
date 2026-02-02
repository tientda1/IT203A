package com.rikkeiedu.management;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> studentList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n========= QUẢN LÝ HỌC SINH (" + Student.SCHOOL_NAME + ") =========");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tính điểm trung bình toàn bộ");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
                continue;
            }

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showAllStudents();
                    break;
                case 3:
                    calculateAverage();
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    public static void addStudent() {
        System.out.print("Nhập tên học sinh: ");
        String name = scanner.nextLine();

        System.out.print("Nhập tên lớp: ");
        String className = scanner.nextLine();

        double score = 0;
        while (true) {
            try {
                System.out.print("Nhập điểm số: ");
                score = Double.parseDouble(scanner.nextLine());
                if (score < 0 || score > 10) {
                    System.out.println("Điểm phải từ 0 đến 10.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Điểm phải là số.");
            }
        }

        Student newStudent = new Student(name, score, className);
        studentList.add(newStudent);

        System.out.println("Thêm thành công! ID của học sinh là: " + newStudent.getId());
    }

    public static void showAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        System.out.println("\n--- DANH SÁCH HỌC SINH ---");
        for (Student s : studentList) {
            s.displayInfo();
        }
    }

    public static void calculateAverage() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách trống, không thể tính toán.");
            return;
        }

        double totalScore = 0;
        for (Student s : studentList) {
            totalScore += s.getScore();
        }

        double avg = totalScore / studentList.size();
        System.out.printf(">> Điểm trung bình của %d học sinh là: %.2f\n", studentList.size(), avg);
    }
}