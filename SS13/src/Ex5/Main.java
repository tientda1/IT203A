package Ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class patient {
    String id;
    String fullname;
    int age;
    String diagnosis;
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<patient> danhsach = new ArrayList<>();
        int luachon = 0;

        while (luachon != 6) {
            System.out.println("||==========================MENU==========================||");
            System.out.println("||              1. Tiếp nhận bệnh nhân                    ||");
            System.out.println("||              2. Cập nhật chẩn đoán                     ||");
            System.out.println("||              3. Xuất viện                              ||");
            System.out.println("||              4. Sắp xếp danh sách bệnh nhân            ||");
            System.out.println("||              5. Hiển thị danh sách bệnh nhân           ||");
            System.out.println("||              6. Thoát                                  ||");
            System.out.println("||========================================================||");
            System.out.print("Chọn chức năng: ");

            luachon = scanner.nextInt();
            scanner.nextLine();

            if (luachon == 1) {
                System.out.print("Nhập ID bệnh nhân: ");
                String id = scanner.nextLine();

                boolean trungid = false;
                for (int i = 0; i < danhsach.size(); i++) {
                    if (danhsach.get(i).id.equals(id)) {
                        trungid = true;
                        break;
                    }
                }

                if (trungid) {
                    System.out.println("ID đã tồn tại.");
                } else {
                    System.out.print("Nhập tên bệnh nhân: ");
                    String fullname = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập chẩn đoán: ");
                    String diagnosis = scanner.nextLine();

                    patient p = new patient();
                    p.id = id;
                    p.fullname = fullname;
                    p.age = age;
                    p.diagnosis = diagnosis;
                    danhsach.add(p);
                    System.out.println("Bệnh nhân đã được thêm thành công.");
                }
            } else if (luachon == 2) {
                System.out.print("Nhập ID bệnh nhân để cập nhật chẩn đoán: ");
                String id = scanner.nextLine();
                boolean timthay = false;
                for (int i = 0; i < danhsach.size(); i++) {
                    if (danhsach.get(i).id.equals(id)) {
                        System.out.print("Nhập chẩn đoán mới: ");
                        danhsach.get(i).diagnosis = scanner.nextLine();
                        System.out.println("Chẩn đoán đã được cập nhật.");
                        timthay = true;
                        break;
                    }
                }
                if (!timthay) {
                    System.out.println("Không tìm thấy bệnh nhân với ID đã cho.");
                }
            } else if (luachon == 3) {
                System.out.print("Nhập ID bệnh nhân để xuất viện: ");
                String id = scanner.nextLine();
                boolean timthay = false;
                for (int i = 0; i < danhsach.size(); i++) {
                    if (danhsach.get(i).id.equals(id)) {
                        danhsach.remove(i);
                        System.out.println("Xuất viện thành công.");
                        timthay = true;
                        break;
                    }
                }
                if (!timthay) {
                    System.out.println("Không tìm thấy bệnh nhân với ID đã cho.");
                }
            } else if (luachon == 4) {
                for (int i = 0; i < danhsach.size() - 1; i++) {
                    for (int j = i + 1; j < danhsach.size(); j++) {
                        patient p1 = danhsach.get(i);
                        patient p2 = danhsach.get(j);
                        boolean swap = false;

                        if (p1.age < p2.age) {
                            swap = true;
                        } else if (p1.age == p2.age) {
                            if (p1.fullname.compareTo(p2.fullname) > 0) {
                                swap = true;
                            }
                        }

                        if (swap) {
                            danhsach.set(i, p2);
                            danhsach.set(j, p1);
                        }
                    }
                }
                System.out.println("Danh sách bệnh nhân đã được sắp xếp.");
            } else if (luachon == 5) {
                System.out.println("====================Danh sách bệnh nhân====================");
                for (int i = 0; i < danhsach.size(); i++) {
                    patient p = danhsach.get(i);
                    System.out.println("| ID : " + p.id + " | FullName : " + p.fullname + " | Age : " + p.age + " | Diagnosis : " + p.diagnosis + " |");
                }
            }
        }
    }
}
