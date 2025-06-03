import java.util.Arrays;

public class Arrayscopyof {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int[] copy = Arrays.copyOf(arr, arr.length);

        System.out.println("Copied using Arrays.copyOf:");
        System.out.println(Arrays.toString(copy));
    }
}
