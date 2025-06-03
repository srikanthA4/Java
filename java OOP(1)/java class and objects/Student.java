public class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        s1.display();
    }
}
