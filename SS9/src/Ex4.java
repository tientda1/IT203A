class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    public void fetch() {
        System.out.println("Dog is fetching ball");
    }
}

public class Ex4 {
    public static void main(String[] args) {
        Animal animal = new Dog();

        animal.makeSound();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.fetch();
        }
    }
}