//Basic Singleton Implementation
// Singleton Example

class Singleton {
    // Step 1: private static instance
    private static Singleton instance;

    // Step 2: private constructor
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Step 3: public method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();  // lazy initialization
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton");
    }
}

public class SingletonE {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.showMessage();

        Singleton s2 = Singleton.getInstance();
        s2.showMessage();

        System.out.println("Are s1 and s2 same? " + (s1 == s2));  // true
    }
}
