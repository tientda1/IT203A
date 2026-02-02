class Config {
    public static final double MAX_SCORE = 10.0;
    public static final double MIN_SCORE = 0.0;
    public static final String SCHOOL_NAME = "Rikkei Academy";
}

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("=== HỆ THỐNG QUẢN LÝ ĐIỂM SỐ (" + Config.SCHOOL_NAME + ") ===");

        double inputScore = 12.5;
        System.out.println("Điểm nhập vào: " + inputScore);

        if (inputScore > Config.MAX_SCORE || inputScore < Config.MIN_SCORE) {
            System.out.println("--> LỖI: Điểm số không hợp lệ!");
            System.out.println("--> Quy định: Điểm phải từ " + Config.MIN_SCORE + " đến " + Config.MAX_SCORE);
        } else {
            System.out.println("--> Hợp lệ. Đang lưu vào hệ thống...");
        }

        // Config.MAX_SCORE = 100.0;
        // Lỗi biên dịch sẽ báo: "cannot assign a value to final variable MAX_SCORE"
        // (Không thể gán giá trị cho biến final MAX_SCORE)
    }
}