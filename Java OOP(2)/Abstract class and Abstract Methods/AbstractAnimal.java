// AbstractAnimal
//Abstract Class with One Abstract Method

abstract class Animal {
    abstract void sound(); // abstract method

    void sleep() {
        System.out.println("Animal sleeps...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractAnimal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();  // implementation from Dog
        d.sleep();  // inherited non-abstract method
    }
}
