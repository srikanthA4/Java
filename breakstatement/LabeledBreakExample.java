public class LabeledBreakExample {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    break outerLoop;  // exits both loops
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
