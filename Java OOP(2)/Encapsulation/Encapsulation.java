// EncapsulationExample.java

class Student {
    // 1. private fields (data hiding)
    private String name;
    private int age;

    // 2. public getter method
    public String getName() {
        return name;
    }

    // 3. public setter method
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {  // data validation
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

public class Encapsulation  {
    public static void main(String[] args) {
        Student s = new Student();

        // setting values using setter methods
        s.setName("Alice");
        s.setAge(20);

        // accessing values using getter methods
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());

        // trying invalid age
        s.setAge(-5);  // Age must be positive.
    }
}
