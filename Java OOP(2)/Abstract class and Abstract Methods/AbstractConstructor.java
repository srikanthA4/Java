

// AbstractConstructor
// Abstract Class with Constructor

abstract class Person {
    String name;

    Person(String name) {
        this.name = name;
       // System.out.println("Person constructor called");
    }

    abstract void display();
}

class Student extends Person {
    Student(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println("Student name is: " + name);
    }
}

public class AbstractConstructor {
    public static void main(String[] args) {
        Student s = new Student("Alice");
        s.display();
    }
}
