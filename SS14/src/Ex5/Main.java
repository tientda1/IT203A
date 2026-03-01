package Ex5;

import java.util.Comparator;
import java.util.TreeSet;

class Patient {
    String name;
    int severity;
    String arrivalTime;

    public Patient(String name, int severity, String arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        String severityText = (severity == 1) ? "Nguy kịch" : ((severity == 2) ? "Nặng" : "Nhẹ");
        return "Bệnh nhân " + name + " (Mức " + severity + " - " + severityText + ", đến lúc " + arrivalTime + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Comparator<Patient> triageRule = Comparator
                .comparingInt((Patient p) -> p.severity)
                .thenComparing(p -> p.arrivalTime)
                .thenComparing(p -> p.name);

        TreeSet<Patient> emergencyQueue = new TreeSet<>(triageRule);

        emergencyQueue.add(new Patient("A", 3, "08:00"));
        emergencyQueue.add(new Patient("B", 1, "08:15"));
        emergencyQueue.add(new Patient("C", 1, "08:05"));

        System.out.println("THỨ TỰ XỬ LÝ CẤP CỨU:");
        for (Patient p : emergencyQueue) {
            System.out.println(p);
        }
    }
}
