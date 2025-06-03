public class Student {
    static String schoolName = "ABC High School";  // shared by all students
    String name;

    Student(String name) {
        this.name = name;
    }

    void show() {
        System.out.println(name + " studies at " + schoolName);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        s1.show();
        s2.show();
    }
}
