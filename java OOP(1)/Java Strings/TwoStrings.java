public class TwoStrings {
  public static void main(String[] args) {

    // create first string
    String first = "India";
    System.out.println("First String: " + first);

    // create second
    String second = " is my country";
    System.out.println("Second String: " + second);

    // join two strings
    String joinedString = first.concat(second);
    System.out.println("Joined String: " + joinedString);
  }
}