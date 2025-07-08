//Enum with Fields, Constructor & Method

// Enum With Fields

enum Status {
    NEW("New Order"),
    PROCESSING("Processing Order"),
    COMPLETED("Order Completed");

    private String description;

    // Constructor
    Status(String description) {
        this.description = description;
    }

    // Method
    public String getDescription() {
        return description;
    }
}

public class EnumWithFields {
    public static void main(String[] args) {
        for (Status s : Status.values()) {
            System.out.println(s + ": " + s.getDescription());
        }
    }
}
