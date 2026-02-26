package Ex2;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota");
        Vehicle myBicycle = new Bicycle("Giant");

        System.out.println("--- THÔNG TIN BÃI XE ---");
        myCar.move();
        myBicycle.move();
    }
}
