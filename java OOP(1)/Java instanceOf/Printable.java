interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing Document");
    }
}

public class TestInterfaceInstanceof {
    public static void main(String[] args) {
        Printable p = new Document();

        if (p instanceof Printable) {
            p.print();  // safe to call method
        }
    }
}
