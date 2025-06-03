public class Box {
    void show(Box b) {
        System.out.println("Box object received: " + b);
    }

    void display() {
        this.show(this);  // passing current object
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        b1.display();
    }
}
