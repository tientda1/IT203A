package Ex4;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- HỆ THỐNG NHÀ THÔNG MINH ---");

        RemoteControl smartLight = new RemoteControl() {
            @Override
            public void powerOn() {
                System.out.println("Đèn đã bật");
            }
        };

        smartLight.powerOn();

        smartLight.checkBattery();
    }
}
