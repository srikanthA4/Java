public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        System.out.println("Reversed array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
