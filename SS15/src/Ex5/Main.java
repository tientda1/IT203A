package Ex5;

public class Main {
    public static void main(String[] args) {
        EmergencyCaseQueue erSystem = new EmergencyCaseQueue();

        System.out.println("=== 1. KHÂU TIẾP NHẬN BỆNH NHÂN (QUEUE) ===");

        // Tạo bệnh nhân và hồ sơ cấp cứu tương ứng
        EmergencyCase case1 = new EmergencyCase(new Patient("BN01", "Nguyễn Văn A"));
        EmergencyCase case2 = new EmergencyCase(new Patient("BN02", "Trần Thị B"));

        // Thêm vào hàng đợi theo thứ tự (A đến trước, B đến sau)
        erSystem.addCase(case1);
        erSystem.addCase(case2);

        System.out.println("\n=== 2. KHÂU ĐIỀU TRỊ VÀ QUẢN LÝ THAO TÁC (STACK) ===");

        // Gọi ca cấp cứu đầu tiên (Sẽ gọi anh A ra trước theo logic FIFO)
        EmergencyCase currentCase = erSystem.getNextCase();

        if (currentCase != null) {
            // Bác sĩ thực hiện các bước điều trị cho anh A
            currentCase.addStep(new TreatmentStep("Tiếp nhận, đo huyết áp", "08:00"));
            currentCase.addStep(new TreatmentStep("Chẩn đoán: Suy hô hấp", "08:05"));
            currentCase.addStep(new TreatmentStep("Cho thở oxy", "08:10"));

            // Giả sử bác sĩ ghi nhận nhầm một loại thuốc
            currentCase.addStep(new TreatmentStep("Tiêm thuốc X sai liều lượng", "08:12"));

            // Xem lại danh sách thao tác trước khi lưu
            currentCase.displaySteps();

            // Phát hiện sai sót -> Tiến hành UNDO
            System.out.println("\n* PHÁT HIỆN SAI SÓT - THỰC HIỆN UNDO *");
            currentCase.undoStep(); // Thao tác "Tiêm thuốc X" sẽ bị xóa đi

            // Ghi nhận lại thao tác đúng
            currentCase.addStep(new TreatmentStep("Tiêm thuốc Y đúng chỉ định", "08:15"));

            // Xem lại danh sách thao tác sau khi sửa
            currentCase.displaySteps();
        }

        System.out.println("\n=== 3. CHUYỂN SANG BỆNH NHÂN TIẾP THEO ===");
        // Bắt đầu xử lý cho chị B
        EmergencyCase nextCase = erSystem.getNextCase();
        if (nextCase != null) {
            nextCase.addStep(new TreatmentStep("Băng bó vết thương ngoài da", "08:30"));
            nextCase.displaySteps();
        }
    }
}
