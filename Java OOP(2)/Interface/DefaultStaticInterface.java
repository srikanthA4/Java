//Interface with Default and Static Methods (Java 8+) 
// DefaultStaticInterface

interface Vehicle {
    void start();

    default void fuel() {
        System.out.println("Filling fuel...");
    }

    static void info() {
        System.out.println("Vehicle interface: supports default & static methods");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
}

public class DefaultStaticInterface {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.fuel();             // default method
        Vehicle.info();       // static method
    }
}
