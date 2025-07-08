// Anonymous Class with Thread 

// Anonymous Thread Example

public class AnonymousThread {
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                System.out.println("Thread running via anonymous class");
            }
        };

        t.start();
    }
}
