// SuperVariableExample

class Animal {
    String color = "White";
}

class Dog extends Animal {
    String color = "Black";

    void printColor() {
        System.out.println("Dog color: " + color);          // Black
        System.out.println("Animal color: " + super.color); // White
    }
}

public class SuperVariable {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
