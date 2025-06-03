final class Bike {
    void run() {
        System.out.println("Bike is running");
    }
}

// Trying to extend final class causes error:
// class Honda extends Bike {
// }

public class TestFinalClass {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
    }
}
