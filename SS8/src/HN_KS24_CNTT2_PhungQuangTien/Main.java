package HN_KS24_CNTT2_PhungQuangTien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        int currentSize = 0;
        int choice = 0;

        do {
            System.out.println("\n===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo Học lực");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.println("==================================");
            System.out.print("Chọn chức năng: ");

            String inputChoice = scanner.nextLine();

            if (inputChoice.matches("\\d+")) {
                choice = Integer.parseInt(inputChoice);
            } else {
                System.out.println("Lỗi: Vui lòng nhập số nguyên!");
                choice = -1;
            }

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên muốn thêm: ");
                    String inputN = scanner.nextLine();

                    if (inputN.matches("\\d+")) {
                        int n = Integer.parseInt(inputN);

                        if (n <= 0) {
                            System.out.println(" Lỗi: Số lượng phải lớn hơn 0!");
                            break;
                        }

                        for (int i = 0; i < n; i++) {
                            System.out.println("\n--- Nhập thông tin sinh viên mới thứ " + (i + 1) + " ---");

                            String inputId = "";
                            while (true) {
                                System.out.print("Nhập Mã SV (VD: SV001): ");
                                inputId = scanner.nextLine();

                                boolean isExist = false;
                                for(int k=0; k < currentSize; k++) {
                                    if(students[k].getId().equalsIgnoreCase(inputId)) {
                                        isExist = true;
                                        break;
                                    }
                                }

                                if (isExist) {
                                    System.out.println(" Mã SV này đã tồn tại! Vui lòng nhập mã khác.");
                                    continue;
                                }

                                if (inputId.startsWith("SV") && inputId.length() == 5) {
                                    String numberPart = inputId.substring(2);
                                    if (numberPart.matches("\\d+")) {
                                        break;
                                    }
                                }
                                System.out.println(" Mã SV sai! Phải bắt đầu bằng 'SV' + 3 chữ số.");
                            }

                            System.out.print("Nhập Họ và Tên: ");
                            String inputName = scanner.nextLine();

                            double inputScore = -1;
                            while (true) {
                                System.out.print("Nhập Điểm TB (0-10): ");
                                String inputScoreStr = scanner.nextLine();

                                if (inputScoreStr.matches("\\d+(\\.\\d+)?")) {
                                    inputScore = Double.parseDouble(inputScoreStr);
                                    if (inputScore >= 0 && inputScore <= 10) break;
                                    else System.out.println(" Điểm phải từ 0 - 10.");
                                } else {
                                    System.out.println(" Lỗi: Vui lòng nhập số (VD: 8.5).");
                                }
                            }

                            students[currentSize] = new Student(inputId, inputName, inputScore);
                            currentSize++;
                        }
                        System.out.println(" Thêm thành công " + n + " sinh viên!");
                    } else {
                        System.out.println(" Lỗi: Số lượng phải là số nguyên!");
                    }
                    break;

                case 2:
                    if (currentSize == 0) {
                        System.out.println("Danh sách trống!");
                    } else {
                        System.out.println("\n--- DANH SÁCH SINH VIÊN ---");
                        for (int i = 0; i < currentSize; i++) {
                            System.out.println(students[i].toString());
                        }
                    }
                    break;

                case 3:
                    if (currentSize == 0) {
                        System.out.println("Danh sách trống!");
                    } else {
                        System.out.print("Nhập học lực cần tìm (Gioi/Kha/Trung Binh): ");
                        String searchRank = scanner.nextLine();
                        boolean found = false;

                        System.out.println("Kết quả tìm kiếm:");
                        for (int i = 0; i < currentSize; i++) {
                            if (students[i].getRank().equalsIgnoreCase(searchRank)) {
                                System.out.println(students[i].toString());
                                found = true;
                            }
                        }

                        if (!found) {
                            System.out.println("Không tìm thấy sinh viên nào có học lực: " + searchRank);
                        }
                    }
                    break;

                case 4:
                    if (currentSize == 0) {
                        System.out.println("Danh sách trống!");
                    } else {
                        for (int i = 0; i < currentSize - 1; i++) {
                            for (int j = 0; j < currentSize - i - 1; j++) {
                                if (students[j].getScore() < students[j + 1].getScore()) {
                                    Student temp = students[j];
                                    students[j] = students[j + 1];
                                    students[j + 1] = temp;
                                }
                            }
                        }
                        System.out.println("Đã sắp xếp danh sách theo học lực giảm dần!");
                        for (int i = 0; i < currentSize; i++) {
                            System.out.println(students[i].toString());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Chức năng không hợp lệ!");
            }

        } while (choice != 5);
    }
}