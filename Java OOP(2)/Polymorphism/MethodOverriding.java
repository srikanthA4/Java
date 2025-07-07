// MethodOverriding runtime polumorphism 

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Dog();  // upcasting
        a.sound();             // Dog barks (runtime decision)
    }
}
