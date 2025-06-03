public class MaxInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {5, 3, 9},
            {7, 2, 8},
            {6, 4, 1}
        };

        int max = matrix[0][0];

        for (int[] row : matrix) {
            for (int val : row) {
                if (val > max) {
                    max = val;
                }
            }
        }

        System.out.println("Maximum value in matrix = " + max);
    }
}
