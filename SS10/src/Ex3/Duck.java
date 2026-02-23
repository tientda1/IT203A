package Ex3;

public class Duck extends Animal implements Swimmable, Flyable {

    public Duck(String name) {
        super(name); // Gọi constructor của Animal
    }

    @Override
    public void swim() {
        System.out.println(name + " đang bơi lội tung tăng trên mặt hồ.");
    }

    @Override
    public void fly() {
        System.out.println(name + " đang cất cánh bay lên bầu trời.");
    }
}
