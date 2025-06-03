public class ContinueDoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            if (i == 3) {
                continue; // skip when i is 3
            }
            System.out.println(i);
        } while (i < 5);
    }
}
