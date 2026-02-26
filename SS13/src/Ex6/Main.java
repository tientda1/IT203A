package Ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class medicine {
    String drugid;
    String drugname;
    double unitprice;
    int quantity;
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<medicine> danhsachthuoc = new ArrayList<>();
        int luachon = 0;

        while (luachon != 6) {
            System.out.println("||==========================MENU==========================||");
            System.out.println("||              1. Thêm thuốc vào đơn                     ||");
            System.out.println("||              2. Điều chỉnh số lượng                    ||");
            System.out.println("||              3. Xóa thuốc                              ||");
            System.out.println("||              4. In hóa đơn                             ||");
            System.out.println("||              5. Tìm thuốc giá rẻ                       ||");
            System.out.println("||              6. Thoát                                  ||");
            System.out.println("||========================================================||");
            System.out.print("Chọn lựa chọn: ");

            luachon = scanner.nextInt();
            scanner.nextLine();

            if (luachon == 1) {
                System.out.print("Nhập mã thuốc: ");
                String id = scanner.nextLine();

                boolean tontai = false;
                for (int i = 0; i < danhsachthuoc.size(); i++) {
                    if (danhsachthuoc.get(i).drugid.equals(id)) {
                        tontai = true;
                        System.out.print("Nhập tên thuốc: ");
                        scanner.nextLine();
                        System.out.print("Nhập giá thuốc: ");
                        scanner.nextDouble();
                        System.out.print("Nhập số lượng: ");
                        int qty = scanner.nextInt();
                        scanner.nextLine();

                        danhsachthuoc.get(i).quantity += qty;
                        System.out.println("Thêm thuốc thành công !");
                        break;
                    }
                }

                if (!tontai) {
                    System.out.print("Nhập tên thuốc: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá thuốc: ");
                    double price = scanner.nextDouble();
                    System.out.print("Nhập số lượng: ");
                    int qty = scanner.nextInt();
                    scanner.nextLine();

                    medicine m = new medicine();
                    m.drugid = id;
                    m.drugname = name;
                    m.unitprice = price;
                    m.quantity = qty;
                    danhsachthuoc.add(m);
                    System.out.println("Thêm thuốc thành công !");
                }
            } else if (luachon == 2) {
                boolean timthay = false;
                while (!timthay) {
                    System.out.print("Nhập mã thuốc: ");
                    String id = scanner.nextLine();
                    for (int i = 0; i < danhsachthuoc.size(); i++) {
                        if (danhsachthuoc.get(i).drugid.equals(id)) {
                            timthay = true;
                            System.out.print("Nhập số lượng mới: ");
                            int newQty = scanner.nextInt();
                            scanner.nextLine();
                            if (newQty == 0) {
                                danhsachthuoc.remove(i);
                            } else {
                                danhsachthuoc.get(i).quantity = newQty;
                            }
                            System.out.println("Cập nhật thuốc thành công !");
                            break;
                        }
                    }
                    if (!timthay) {
                        System.out.println("Thuốc không tồn tại trong đơn.");
                    }
                }
            } else if (luachon == 3) {
                System.out.print("Nhập mã thuốc cần xóa: ");
                String id = scanner.nextLine();
                boolean timthay = false;
                for (int i = 0; i < danhsachthuoc.size(); i++) {
                    if (danhsachthuoc.get(i).drugid.equals(id)) {
                        danhsachthuoc.remove(i);
                        System.out.println("Xóa thuốc thành công !");
                        timthay = true;
                        break;
                    }
                }
                if (!timthay) {
                    System.out.println("Id thuốc không tồn tại !");
                }
            } else if (luachon == 4) {
                System.out.printf("%-15s %-25s %-15s %-10s\n", "Mã Thuốc", "Tên Thuốc", "Đơn Giá", "Số Lượng");
                double tongTienHD = 0;
                for (int i = 0; i < danhsachthuoc.size(); i++) {
                    medicine m = danhsachthuoc.get(i);
                    System.out.printf("%-15s %-25s %-15.2f %-10d\n", m.drugid, m.drugname, m.unitprice, m.quantity);
                    tongTienHD += m.unitprice * m.quantity;
                }
                System.out.printf("Tổng tiền: %.2f VNĐ\n", tongTienHD);
                danhsachthuoc.clear();
            } else if (luachon == 5) {
                System.out.printf("%-15s %-25s %-15s\n", "Mã Thuốc", "Tên Thuốc", "Đơn Giá");
                for (int i = 0; i < danhsachthuoc.size(); i++) {
                    medicine m = danhsachthuoc.get(i);
                    if (m.unitprice < 50000) {
                        System.out.printf("%-15s %-25s %-15.2f\n", m.drugid, m.drugname, m.unitprice);
                    }
                }
            }
        }
    }
}
