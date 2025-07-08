// Static Nested Class Example

class Outer {
    static int data = 100;

    static class Nested {
        void display() {
            System.out.println("Data from Outer class: " + data);
            System.out.println("Inside Static Nested Class");
        }
    }
}

public class StaticNestedClass{
    public static void main(String[] args) {
        // Creating object of static nested class without outer class instance
        Outer.Nested obj = new Outer.Nested();
        obj.display();
    }
}
