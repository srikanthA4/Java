class Animal { }

class Dog extends Animal { }

public class TestInstanceof {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        System.out.println(a instanceof Animal);  // true
        System.out.println(d instanceof Animal);  // true
        System.out.println(a instanceof Dog);     // false
        System.out.println(d instanceof Dog);     // true
    }
}

