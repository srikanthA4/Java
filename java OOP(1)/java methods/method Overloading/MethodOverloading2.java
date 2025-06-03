public class MethodOverloading2 {
    
    // Method with two integer parameters
    int multiply(int a, int b) {
        return a * b;
    }

    // Overloaded method with two double parameters
    double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        MethodOverloading2 obj = new MethodOverloading2();
        
        System.out.println("Product of integers: " + obj.multiply(5, 3));
        System.out.println("Product of doubles: " + obj.multiply(5.5, 3.2));
    }
}
