public class Example2 {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Example2 obj = new Example2();
        int result = obj.add(5, 3);
        System.out.println("Sum is: " + result);
    }
}
