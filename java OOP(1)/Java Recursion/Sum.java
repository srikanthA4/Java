public class Sum {
    static int sum(int n) {
        if (n == 1)  // base case
            return 1;
        else
            return n + sum(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum from 1 to " + n + " is " + sum(n));
    }
}
