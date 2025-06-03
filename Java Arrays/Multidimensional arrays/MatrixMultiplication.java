public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 0},
            {3, 4, 2},
            {2, 3, 5}
        };
        int[] [] B = {
            {2, 0,0},
            {1, 2, 1},
            {3, 5, 7}
        };

        int[][] result = new int[3][3];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Multiplication of matrices:");
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
