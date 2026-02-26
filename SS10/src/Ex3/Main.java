package Ex3;

public class Main {
    public static void main(String[] args) {
        Duck myDuck = new Duck("Vịt Donald");
        Fish myFish = new Fish("Cá Nemo");

        System.out.println("--- HOẠT ĐỘNG CỦA VỊT ---");
        myDuck.swim();
        myDuck.fly();

        System.out.println("\n--- HOẠT ĐỘNG CỦA CÁ ---");
        myFish.swim();
    }
}
