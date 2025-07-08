//Anonymous Class Implementing an Interface
// Anonymous Class With Interface

interface Greeting {
    void sayHello();
}

public class AnonymousClassWithInterface {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous class");
            }
        };

        g.sayHello();
    }
}
