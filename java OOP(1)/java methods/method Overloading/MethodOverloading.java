public class MethodOverloading {
    
    // Method with 2 parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with 3 parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        
        System.out.println("Sum of two numbers: " + obj.add(5, 3));
        System.out.println("Sum of three numbers: " + obj.add(5, 3, 2));
    }
}
