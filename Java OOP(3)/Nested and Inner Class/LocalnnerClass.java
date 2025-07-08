// LocalInnerClass Example 

class Outer {
    void display() {
        String msg = "Local Inner Example";  // effectively final

        class Inner {
            void show() {
                System.out.println("Inside Local Inner Class: " + msg);
            }
        }

        Inner i = new Inner();
        i.show();
    }
}

public class LocalnnerClass{
    public static void main(String[] args) {
        new Outer().display();
    }
}
