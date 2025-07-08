// Enum With String Labels

enum Role {
    ADMIN("Administrator"),
    USER("Regular User"),
    GUEST("Guest User");

    private final String label;

    // Constructor
    Role(String label) {
        this.label = label;
    }

    // Getter
    public String getLabel() {
        return label;
    }
}

public class EnumWithString {
    public static void main(String[] args) {
        for (Role role : Role.values()) {
            System.out.println(role + " => " + role.getLabel());
        }
    }
}
