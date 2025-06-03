public class Factorial {
    static int factorial(int n) {
        if (n == 0)  // base case
            return 1;
        else
            return n * factorial(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        int num = 5;
        int fact = factorial(num);
        System.out.println("Factorial of " + num + " is " + fact);
    }
}
