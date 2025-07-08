// Reflection 
//Get Class Info Using Reflection 

class Person {
    private String name;
    public int age;

    public Person() {}

    public void sayHello() {
        System.out.println("Hello!");
    }
}

public class Reflection {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Person");

        System.out.println("Class Name: " + clazz.getName());

        System.out.println("\nFields:");
        for (var field : clazz.getDeclaredFields()) {
            System.out.println(" - " + field.getName());
        }

        System.out.println("\nMethods:");
        for (var method : clazz.getDeclaredMethods()) {
            System.out.println(" - " + method.getName());
        }

        System.out.println("\nConstructors:");
        for (var constructor : clazz.getDeclaredConstructors()) {
            System.out.println(" - " + constructor);
        }
    }
}
