// BasicEnum Usage

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class BasicEnum {
    public static void main(String[] args) {
        Day today = Day.SUNDAY;

        if (today == Day.SUNDAY) {
            System.out.println("It's a holiday!");
        } else {
            System.out.println("It's a working day.");
        }

        // Loop through enum values
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
