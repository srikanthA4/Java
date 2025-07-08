// Enum By String

enum CountryCode {
    IN("India"),
    US("United States"),
    UK("United Kingdom");

    private final String country;

    CountryCode(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    // Method to get enum from string
    public static CountryCode fromCountry(String country) {
        for (CountryCode c : CountryCode.values()) {
            if (c.getCountry().equalsIgnoreCase(country)) {
                return c;
            }
        }
        return null; // or throw exception
    }
}

public class EnumByString {
    public static void main(String[] args) {
        CountryCode c = CountryCode.fromCountry("India");
        System.out.println("Code for India: " + c);  // Output: Code for India: IN
    }
}
