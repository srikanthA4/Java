public class ContinueWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            i++;
            if (i == 3) {
                continue; // skip when i is 3
            }
            System.out.println(i);
        }
    }
}
