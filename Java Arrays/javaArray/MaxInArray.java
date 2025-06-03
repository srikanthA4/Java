public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 15, 7};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum value: " + max);
    }
}
