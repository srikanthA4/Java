// Handling Multiple Exceptions

public class MultiCatch {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());  // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Error");
        } finally {
            System.out.println("Finally block runs always.");
        }
    }
}
