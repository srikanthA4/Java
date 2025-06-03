public class MethodOverloading3 {
    
    // Method with integer and string parameters
    void printDetails(int a, String name) {
        System.out.println("Number: " + a + ", Name: " + name);
    }

    // Overloaded method with string and integer parameters (order swapped)
    void printDetails(String name, int a) {
        System.out.println("Name: " + name + ", Number: " + a);
    }

    public static void main(String[] args) {
        MethodOverloading3 obj = new MethodOverloading3();
        
        obj.printDetails(10, "Alice");   // Calls the first method
        obj.printDetails("Bob", 20);     // Calls the second method
    }
}
