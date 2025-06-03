public class DefaultExample {
    void greet() {  // no modifier = default access
        System.out.println("Hello from default method");
    }

    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        obj.greet();  // ✅ works because it's in the same class
    }
}
