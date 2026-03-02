package Ex1;

public class Main {
    public static void main(String[] args) {
        MedicalRecordHistory manager = new MedicalRecordHistory();

        System.out.println("=== BÁC SĨ BẮT ĐẦU CHỈNH SỬA HỒ SƠ ===");

        manager.addEdit(new EditAction("Cập nhật nhịp tim: 80 bpm", "08:00"));
        manager.displayHistory();

        manager.addEdit(new EditAction("Kê đơn: Paracetamol 500mg", "08:15"));
        manager.displayHistory();

        manager.addEdit(new EditAction("Ghi chú: Bệnh nhân đã tỉnh táo", "08:30"));
        manager.displayHistory();

        EditAction latest = manager.getLatestEdit();
        System.out.println(">>> ĐANG XEM CHỈNH SỬA GẦN NHẤT: " +
                (latest != null ? latest.getDescription() : "Trống"));

        System.out.println("\n=== BÁC SĨ NHẤN UNDO LẦN 1 ===");
        manager.undoEdit();
        manager.displayHistory();

        System.out.println("=== BÁC SĨ NHẤN UNDO LẦN 2 ===");
        manager.undoEdit();
        manager.displayHistory();
    }
}
