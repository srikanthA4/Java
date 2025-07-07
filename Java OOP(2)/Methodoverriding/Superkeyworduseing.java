// SuperMethodExample.java

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    @Override
    void run() {
        super.run(); // calling parent method
        System.out.println("Car is running smoothly");
    }
}

public class Superkeyworduseing {
    public static void main(String[] args) {
        Car c = new Car();
        c.run();
    }
}
