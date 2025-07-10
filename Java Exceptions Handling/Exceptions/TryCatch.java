// TryCatch 

public class TryCatch {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // causes ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
