public class Copy2DArray {
    public static void main(String[] args) {
        int[][] original = {
            {1, 2},
            {3, 4}
        };

        int[][] copy = new int[2][2];

        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                copy[i][j] = original[i][j];
            }
        }

        System.out.println("Copied 2D array:");
        for (int[] row : copy) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
