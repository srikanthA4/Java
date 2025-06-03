public class TestCast {
    public static void main(String[] args) {
        Animal a = new Dog();  // upcasting

        if (a instanceof Dog) {
            Dog d = (Dog) a;  // safe casting
            System.out.println("Casting successful");
        } else {
            System.out.println("Cannot cast");
        }
    }
}
