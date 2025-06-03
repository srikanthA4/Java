public class Fibonacci {
    static int fibonacci(int n) {
        if (n == 0)
            return 0;  // base case 1
        else if (n == 1)
            return 1;  // base case 2
        else
            return fibonacci(n - 1) + fibonacci(n - 2);  // recursive call
    }

    public static void main(String[] args) {
        int count = 7;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
