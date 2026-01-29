import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] studentArr = new String[100];
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String regexStudentCode = "^B\\d{7}$";
        int choice;

        do {
            // --- MENU ---
            System.out.println("\n========= QUẢN LÝ MSSV =========");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm mới MSSV");
            System.out.println("3. Cập nhật MSSV");
            System.out.println("4. Xóa MSSV");
            System.out.println("5. Tìm kiếm MSSV");
            System.out.println("0. Thoát");
            System.out.println("===================================");
            System.out.print("Chọn chức năng: ");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                
                // Chức năng Hiển thị
                case 1:
                    System.out.println("\n--- DANH SÁCH SINH VIÊN ---");
                    if (count == 0) {
                        System.out.println(" Danh sách trống!");
                    } else {
                        System.out.printf("%-5s %-10s %-15s\n", "STT", "Index", "MSSV");
                        for (int i = 0; i < count; i++) {
                            System.out.printf("%-5d %-10d %-15s\n", (i + 1), i, studentArr[i]);
                        }
                    }
                    break;
                    
                // Chức năng Thêm mới
                case 2:
                    if (count >= 100) {
                        System.out.println("Danh sách đã đầy!");
                    } else {
                        System.out.println("\n--- THÊM MỚI ---");
                        String newStudent;
                        while (true) {
                            System.out.print("Nhập MSSV (VD: B2101234): ");
                            newStudent = scanner.nextLine().trim().toUpperCase();

                            if (Pattern.matches(regexStudentCode, newStudent)) {
                                boolean isExist = false;
                                for (int i = 0; i < count; i++) {
                                    if (studentArr[i].equals(newStudent)) {
                                        isExist = true;
                                        break;
                                    }
                                }
                                if (isExist) {
                                    System.out.println("MSSV này đã tồn tại!");
                                } else {
                                    break;
                                }
                            } else {
                                System.out.println("Sai định dạng (B + 7 số)!");
                            }
                        }
                        studentArr[count] = newStudent;
                        count++;
                        System.out.println(" Thêm mới thành công!");
                    }
                    break;

                // Chức năng cập nhật
                case 3:
                    System.out.println("\n--- CẬP NHẬT ---");
                    if (count == 0) {
                        System.out.println(" Danh sách trống!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.printf("Index %d: %s\n", i, studentArr[i]);
                        }

                        System.out.print("Nhập vị trí (index) cần sửa: ");
                        int indexUpdate;
                        try {
                            indexUpdate = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            indexUpdate = -1;
                        }

                        if (indexUpdate >= 0 && indexUpdate < count) {
                            System.out.println("Đang sửa phần tử: " + studentArr[indexUpdate]);
                            String updateStudent;
                            while (true) {
                                System.out.print("Nhập MSSV mới: ");
                                updateStudent = scanner.nextLine().trim().toUpperCase();
                                if (Pattern.matches(regexStudentCode, updateStudent)) {
                                    break;
                                } else {
                                    System.out.println("Sai định dạng (B + 7 số)!");
                                }
                            }
                            studentArr[indexUpdate] = updateStudent;
                            System.out.println(" Cập nhật thành công!");
                        } else {
                            System.out.println("Vị trí không tồn tại!");
                        }
                    }
                    break;
                // Chức năng Xóa (Dồn)
                case 4:
                    System.out.println("\n--- XÓA SINH VIÊN ---");
                    if (count == 0) {
                        System.out.println(" Danh sách trống!");
                    } else {
                        System.out.print("Nhập MSSV cần xóa: ");
                        String studentDel = scanner.nextLine().trim();
                        int indexDel = -1;
                        
                        for (int i = 0; i < count; i++) {
                            if (studentArr[i].equals(studentDel)) {
                                indexDel = i;
                                break;
                            }
                        }

                        if (indexDel != -1) {
                            for (int i = indexDel; i < count - 1; i++) {
                                studentArr[i] = studentArr[i + 1];
                            }
                            studentArr[count - 1] = null;
                            count--;
                            System.out.println("Đã xóa thành công: " + studentDel);
                        } else {
                            System.out.println("Lỗi: Không tìm thấy MSSV này!");
                        }
                    }
                    break;
                // Chức năng tìm kiếm
                case 5:
                    System.out.println("\n--- TÌM KIẾM ---");
                    if (count == 0) {
                        System.out.println("Danh sách trống!");
                    } else {
                        System.out.print("Nhập chuỗi ký tự cần tìm: ");
                        String keyword = scanner.nextLine().trim().toLowerCase();
                        boolean found = false;

                        System.out.println("Kết quả tìm kiếm:");
                        for (int i = 0; i < count; i++) {
                            if (studentArr[i].toLowerCase().contains(keyword)) {
                                System.out.println("- " + studentArr[i]);
                                found = true;
                            }
                        }
                        if (!found) System.out.println(" Không tìm thấy kết quả nào!");
                    }
                    break;

                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;

                default:
                    System.out.println(" Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }
}