public class Calculator {
    static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        int result = Calculator.square(5);  // no object needed
        System.out.println("Square is: " + result);
    }
}
