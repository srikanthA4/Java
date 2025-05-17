import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // read full name

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // read age

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        sc.close(); 
    }
}