// Multiple Abstract and Non-Abstract Methods

// AbstractShape.java

abstract class Shape {
    abstract void draw(); // abstract method
    abstract double area(); // abstract method

    void info() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double radius = 5;

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractShape {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        System.out.println("Area: " + c.area());
        c.info();
    }
}
