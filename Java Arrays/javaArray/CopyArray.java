public class CopyArray {
    public static void main(String[] args) {
        int[] original = {2, 4, 6, 8};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        System.out.println("Copied array:");
        for (int value : copy) {
            System.out.print(value + " ");
        }
    }
}
