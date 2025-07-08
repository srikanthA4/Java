// MemberInnerClass

class Outer {
    private String msg = "Hello from Outer";

    class Inner {
        void show() {
            System.out.println("Member Inner Class says: " + msg);
        }
    }
}

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();  // requires outer object
        inner.show();
    }
}
