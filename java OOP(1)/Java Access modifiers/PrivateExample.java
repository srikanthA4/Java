public class PrivateExample {
    private int age = 25;  // private variable

    private void displayAge() {
        System.out.println("Age is: " + age);
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        // obj.age = 30;           //  Not allowed
        // obj.displayAge();       //  Not allowed from outside
        obj.displayAge();          //  Allowed inside the same class
    }
}
