public class SystemArrayCopy {
    public static void main(String[] args) {
        int[] source = {10, 20, 30, 40};
        int[] destination = new int[source.length];

        System.arraycopy(source, 0, destination, 0, source.length);

        System.out.println("Copied using System.arraycopy:");
        for (int num : destination) {
            System.out.print(num + " ");
        }
    }
}
