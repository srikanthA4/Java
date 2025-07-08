// Enum Constructor

enum Day {
    MONDAY("Weekday"),
    SATURDAY("Weekend"),
    SUNDAY("Weekend");

    private final String type;

    // Constructor (must be private or default)
    Day(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

public class EnumConstructor{
    public static void main(String[] args) {
        for (Day d : Day.values()) {
            System.out.println(d + " is a " + d.getType());
        }
    }
}
