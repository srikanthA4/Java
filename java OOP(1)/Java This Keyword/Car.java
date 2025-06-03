public class Car {
    void start() {
        System.out.println("Car started");
    }

    void drive() {
        this.start();  // calling another method using 'this'
        System.out.println("Car is moving");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}
