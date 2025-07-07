// SuperKeywordExample

// Used:

// 1. Call parent class constructor

// 2. Access parent class methods or variables

class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // calling Animal constructor
        System.out.println("Dog constructor called");
    }

    void sound() {
        super.sound(); // calling parent method
        System.out.println("Dog barks");
    }
}

public class superkeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
