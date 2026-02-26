package Ex6;

public class Main {
    public static void main(String[] args) {
        User u1 = new User(1, "dev_a", "123456");
        User u2 = new User(2, "dev_b", "password123");
        User u3 = new User(3, "dev_c", "admin@123");

        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        System.out.println(">> Đã thêm 3 user vào hệ thống.");

        System.out.println("Danh sách hiện tại:");
        for (User u : UserManager.users) {
            System.out.println(u.toString());
        }

        System.out.println("\n>> Kiểm tra đăng nhập:");

        performLoginTest("dev_a", "123456");

        performLoginTest("dev_b", "sai_pass");

        performLoginTest("hacker", "123456");

        // u1.id = 999;
        // Lỗi biên dịch: "cannot assign a value to final variable id"
        // (Không thể gán giá trị cho biến final id)
    }

    public static void performLoginTest(String u, String p) {
        boolean result = UserManager.checkLogin(u, p);
        String status = result ? "Thành công!" : "Thất bại!";
        System.out.println("- Login (\"" + u + "\", \"" + p + "\"): " + status);
    }
}
