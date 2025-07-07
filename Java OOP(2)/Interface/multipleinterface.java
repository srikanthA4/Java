// MultipleInterface

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Demo implements Printable, Showable {
    public void print() {
        System.out.println("Printing...");
    }

    public void show() {
        System.out.println("Showing...");
    }
}

public class multipleinterface {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.print();
        d.show();
    }
}
