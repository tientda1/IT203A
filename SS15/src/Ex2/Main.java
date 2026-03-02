package Ex2;

public class Main {
    public static void main(String[] args) {
        PatientQueue clinicQueue = new PatientQueue();

        System.out.println("=== 07:30 SÁNG: TIẾP NHẬN BỆNH NHÂN ===");

        clinicQueue.addPatient(new Patient("BN01", "Nguyễn Văn A", 45));
        clinicQueue.addPatient(new Patient("BN02", "Trần Thị B", 30));
        clinicQueue.addPatient(new Patient("BN03", "Lê Văn C", 65));

        clinicQueue.displayQueue();

        Patient nextPatient = clinicQueue.peekNextPatient();
        System.out.println(">>> Y tá đang chuẩn bị hồ sơ cho: " +
                (nextPatient != null ? nextPatient.getName() : "Không có ai"));

        System.out.println("\n=== 08:00 SÁNG: BẮT ĐẦU KHÁM ===");

        clinicQueue.callNextPatient();
        clinicQueue.displayQueue();

        clinicQueue.callNextPatient();
        clinicQueue.displayQueue();
    }
}
