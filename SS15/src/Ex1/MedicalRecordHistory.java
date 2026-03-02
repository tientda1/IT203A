package Ex1;

import java.util.Stack;

public class MedicalRecordHistory {
    private Stack<EditAction> history;

    public MedicalRecordHistory() {
        this.history = new Stack<>();
    }

    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println(">>> ĐÃ THÊM CHỈNH SỬA: " + action.getDescription());
    }

    public EditAction undoEdit() {
        if (!isEmpty()) {
            EditAction action = history.pop();
            System.out.println("<<< ĐÃ HOÀN TÁC (UNDO): " + action.getDescription());
            return action;
        }
        System.out.println("!!! Lỗi: Không có thao tác nào để hoàn tác.");
        return null;
    }

    public EditAction getLatestEdit() {
        if (!isEmpty()) {
            return history.peek();
        }
        return null;
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public void displayHistory() {
        System.out.println("\n--- TRẠNG THÁI STACK LỊCH SỬ (Đỉnh ở trên) ---");
        if (isEmpty()) {
            System.out.println("(Stack trống)");
        } else {
            for (int i = history.size() - 1; i >= 0; i--) {
                System.out.println(history.get(i));
            }
        }
        System.out.println("----------------------------------------------\n");
    }
}
