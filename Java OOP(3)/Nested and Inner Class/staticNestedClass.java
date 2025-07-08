// StaticNestedClassExample

class Outer {
    static int data = 50;

    static class Inner {
        void show() {
            System.out.println("Static nested class, data: " + data);
        }
    }
}

public class staticNestedClass{
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();  // no need for Outer object
        obj.show();
    }
}
