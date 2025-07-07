//InterfaceVariableExample

interface Config {
    int MAX_LIMIT = 100;  // public static final by default
}

public class InterfaceVariable {
    public static void main(String[] args) {
        System.out.println("Max Limit: " + Config.MAX_LIMIT);
        // Config.MAX_LIMIT = 200; //  Error: cannot change final variable
    }
}
