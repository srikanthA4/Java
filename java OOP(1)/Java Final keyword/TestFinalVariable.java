public class TestFinalVariable {
    final int MAX_VALUE = 100;  // constant

    void show() {
        // MAX_VALUE = 200;  // Error! Can't change a final variable
        System.out.println("Max value is: " + MAX_VALUE);
    }

    public static void main(String[] args) {
        TestFinalVariable obj = new TestFinalVariable();
        obj.show();
    }
}
