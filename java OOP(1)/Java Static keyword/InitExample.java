public class InitExample {
    static int value;

    // Static block runs once before main()
    static {
        value = 10;
        System.out.println("Static block initialized value to " + value);
    }

    public static void main(String[] args) {
        System.out.println("Main method running...");
        System.out.println("Value is: " + value);
    }
}
