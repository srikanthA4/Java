// Using throws and Custom Exception

// CustomException

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class CustomException {
    static void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or older.");
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (AgeException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
