public class NestedIfExample {
    public static void main(String[] args) {
        int marks = 85;

        if (marks >= 50) {
            System.out.println("You passed the exam.");

            if (marks >= 75) {
                System.out.println("Congratulations! You got Distinction.");
            } else {
                System.out.println("Good job! You passed.");
            }

        } else {
            System.out.println("Sorry, you failed the exam.");
        }
    }
}
