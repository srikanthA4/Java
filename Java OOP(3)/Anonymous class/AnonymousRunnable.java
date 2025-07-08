// Anonymous Class with Runnable Interface
// AnonymousRunnable

public class AnonymousRunnable {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Runnable running via anonymous class");
            }
        };

        Thread t = new Thread(r);
        t.start();
    }
}
