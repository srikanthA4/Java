// SingleInheritanceExample.java

class Animal {
    void eat() {
        System.out.println("Animals eat food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // Inherited from Animal
        d.bark();  // From Dog class
    }
}
