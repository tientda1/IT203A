package Ex2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private Queue<Patient> queue;

    public PatientQueue() {
        this.queue = new LinkedList<>();
    }

    public void addPatient(Patient p) {
        queue.add(p);
        System.out.println(">>> Đã tiếp nhận bệnh nhân: " + p.getName());
    }

    public Patient callNextPatient() {
        if (!isEmpty()) {
            Patient p = queue.poll();
            System.out.println("<<< BÁC SĨ GỌI KHÁM: " + p.getName());
            return p;
        }
        System.out.println("!!! Không có bệnh nhân nào đang chờ.");
        return null;
    }

    public Patient peekNextPatient() {
        if (!isEmpty()) {
            return queue.peek();
        }
        return null;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void displayQueue() {
        System.out.println("\n--- DANH SÁCH BỆNH NHÂN ĐANG CHỜ KHÁM ---");
        if (isEmpty()) {
            System.out.println("(Hàng đợi trống)");
        } else {
            int stt = 1;
            for (Patient p : queue) {
                System.out.println(stt + ". " + p.toString());
                stt++;
            }
        }
        System.out.println("-----------------------------------------\n");
    }
}
