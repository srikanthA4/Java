public class Student {
    String name;

    // Constructor
    Student(String name) {
        this.name = name;  // 'this.name' refers to the class variable
    }

    void display() {
        System.out.println("Student name is: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        s1.display();
    }
}
