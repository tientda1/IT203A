import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ids = new int[100];
        String[] titles = new String[100];
        int[] quantities = new int[100];

        int count = 0;

        // Vòng lặp chính của chương trình
        while (true) {
            System.out.println("\n=== QUẢN LÝ THƯ VIỆN ===");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm sách mới");
            System.out.println("3. Cập nhật số lượng");
            System.out.println("4. Xóa sách");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Sắp xếp theo số lượng (Giảm dần)");
            System.out.println("7. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Xử lý trôi lệnh sau khi nhập số

            switch (choice) {
                // --- CHỨC NĂNG 1: XEM DANH SÁCH ---
                case 1:
                    System.out.println("--- DANH SÁCH SÁCH ---");
                    if (count == 0) {
                        System.out.println("Kho sách đang trống!");
                    } else {
                        System.out.printf("%-10s %-30s %-10s\n", "MÃ", "TÊN SÁCH", "SỐ LƯỢNG");
                        for (int i = 0; i < count; i++) {
                            System.out.printf("%-10d %-30s %-10d\n", ids[i], titles[i], quantities[i]);
                        }
                    }
                    break;

                // --- CHỨC NĂNG 2: THÊM SÁCH MỚI ---
                case 2:
                    if (count >= 100) {
                        System.out.println("Lỗi: Kho đã đầy, không thể thêm!");
                    } else {
                        System.out.print("Nhập mã sách (số nguyên): ");
                        int newId = scanner.nextInt();
                        scanner.nextLine(); // Xử lý trôi lệnh

                        // Kiểm tra trùng mã
                        boolean isExist = false;
                        for (int i = 0; i < count; i++) {
                            if (ids[i] == newId) {
                                isExist = true;
                                break;
                            }
                        }

                        if (isExist) {
                            System.out.println("Lỗi: Mã sách này đã tồn tại!");
                        } else {
                            System.out.print("Nhập tên sách: ");
                            String newTitle = scanner.nextLine();
                            System.out.print("Nhập số lượng: ");
                            int newQty = scanner.nextInt();

                            // Lưu vào mảng tại vị trí count
                            ids[count] = newId;
                            titles[count] = newTitle;
                            quantities[count] = newQty;

                            // Tăng số lượng sách lên 1
                            count++;
                            System.out.println("Thêm sách thành công!");
                        }
                    }
                    break;

                // --- CHỨC NĂNG 3: CẬP NHẬT SỐ LƯỢNG ---
                case 3:
                    System.out.print("Nhập mã sách cần sửa: ");
                    int updateId = scanner.nextInt();
                    int foundIndex = -1;

                    // Tìm vị trí sách
                    for (int i = 0; i < count; i++) {
                        if (ids[i] == updateId) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex == -1) {
                        System.out.println("Không tìm thấy sách có mã: " + updateId);
                    } else {
                        System.out.println("Tên sách: " + titles[foundIndex]);
                        System.out.println("Số lượng hiện tại: " + quantities[foundIndex]);
                        System.out.print("Nhập số lượng mới: ");
                        quantities[foundIndex] = scanner.nextInt(); // Cập nhật trực tiếp vào mảng
                        System.out.println("Cập nhật thành công!");
                    }
                    break;

                // --- CHỨC NĂNG 4: XÓA SÁCH ---
                case 4:
                    System.out.print("Nhập mã sách cần xóa: ");
                    int deleteId = scanner.nextInt();
                    int delIndex = -1;

                    // Tìm vị trí cần xóa
                    for (int i = 0; i < count; i++) {
                        if (ids[i] == deleteId) {
                            delIndex = i;
                            break;
                        }
                    }

                    if (delIndex == -1) {
                        System.out.println("Không tìm thấy sách để xóa!");
                    } else {
                        // Thuật toán dồn mảng (Shift Left)
                        // Chạy từ vị trí cần xóa đến phần tử kế cuối
                        for (int i = delIndex; i < count - 1; i++) {
                            ids[i] = ids[i + 1];
                            titles[i] = titles[i + 1];
                            quantities[i] = quantities[i + 1];
                        }
                        // Giảm số lượng phần tử
                        count--;
                        System.out.println("Đã xóa sách có mã " + deleteId);
                    }
                    break;

                // --- CHỨC NĂNG 5: TÌM KIẾM ---
                case 5:
                    System.out.print("Nhập từ khóa tên sách: ");
                    String keyword = scanner.nextLine().toLowerCase(); // Chuyển về chữ thường để tìm
                    boolean foundAny = false;

                    System.out.printf("%-10s %-30s %-10s\n", "MÃ", "TÊN SÁCH", "SỐ LƯỢNG");
                    for (int i = 0; i < count; i++) {
                        // So sánh chuỗi (dùng contains để tìm gần đúng)
                        if (titles[i].toLowerCase().contains(keyword)) {
                            System.out.printf("%-10d %-30s %-10d\n", ids[i], titles[i], quantities[i]);
                            foundAny = true;
                        }
                    }
                    if (!foundAny) {
                        System.out.println("Không tìm thấy sách nào khớp từ khóa!");
                    }
                    break;

                // --- CHỨC NĂNG 6: SẮP XẾP GIẢM DẦN ---
                case 6:
                    // Thuật toán Bubble Sort (Nổi bọt)
                    for (int i = 0; i < count - 1; i++) {
                        for (int j = i + 1; j < count; j++) {
                            // Nếu số trước nhỏ hơn số sau -> Đổi chỗ (để giảm dần)
                            if (quantities[i] < quantities[j]) {
                                // 1. Đổi chỗ số lượng
                                int tempQty = quantities[i];
                                quantities[i] = quantities[j];
                                quantities[j] = tempQty;

                                // 2. Đổi chỗ Tên (phải đi theo số lượng)
                                String tempTitle = titles[i];
                                titles[i] = titles[j];
                                titles[j] = tempTitle;

                                // 3. Đổi chỗ Mã (phải đi theo số lượng)
                                int tempId = ids[i];
                                ids[i] = ids[j];
                                ids[j] = tempId;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp danh sách theo số lượng giảm dần!");
                    break;

                // --- CHỨC NĂNG 7: THOÁT ---
                case 7:
                    System.out.println("Cảm ơn đã sử dụng chương trình!");
                    System.exit(0); // Kết thúc chương trình
                    break;

                default:
                    System.out.println("Chức năng không hợp lệ, vui lòng chọn lại!");
            }
        }
    }
}