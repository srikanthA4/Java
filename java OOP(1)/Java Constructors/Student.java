public class Student {
    String name;
    int roll;

    Student(String n, int r) {
        name = n;
        roll = r;
    }

    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + roll);
    }

    public static void main(String[] args) {
        Student s1 = new Student("John", 101);
        s1.displayInfo();
    }
}
