class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof woof");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow meow");
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();
    }
}