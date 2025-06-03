public class ArrayClone {
    public static void main(String[] args) {
        int[] original = {100, 200, 300};
        int[] copy = original.clone();

        System.out.println("Copied using clone():");
        for (int n : copy) {
            System.out.print(n + " ");
        }
    }
}
