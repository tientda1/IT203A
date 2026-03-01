package Ex1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] registeredNames = {
                "Nguyễn Văn A – Yên Bái",
                "Trần Thị B – Thái Bình",
                "Nguyễn Văn A – Yên Bái",
                "Lê Văn C – Hưng Yên"
        };

        Set<String> patientQueue = new LinkedHashSet<>();

        for (String name : registeredNames) {
            boolean isAdded = patientQueue.add(name);

            if (!isAdded) {
                System.out.println("[Hệ thống] Bỏ qua: '" + name + "' (Đã đăng ký trước đó).");
            }
        }

        System.out.println("------------------------------------------------");

        System.out.println("Danh sách gọi khám (Đúng thứ tự, không trùng lặp):");
        int count = 1;
        for (String patient : patientQueue) {
            System.out.println(count + ". " + patient);
            count++;
        }
    }
}
