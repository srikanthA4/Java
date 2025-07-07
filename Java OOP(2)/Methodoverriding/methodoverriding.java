// MethodOverriding 

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

public class methodoverriding {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.sound();  //  (runtime polymorphism)
    }
}
