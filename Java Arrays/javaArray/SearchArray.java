public class SearchArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 9, 12};
        int search = 9;
        boolean found = false;

        for (int value : arr) {
            if (value == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found!");
        } else {
            System.out.println("Element not found!");
        }
    }
}
