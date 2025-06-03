public class BankAccount {
    String name;
    int balance;

    BankAccount(String n, int b) {
        name = n;
        balance = b;
    }

    void showDetails() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 5000);
        acc1.showDetails();
    }
}
