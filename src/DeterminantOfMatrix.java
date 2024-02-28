public class DeterminantOfMatrix {
    static int n; // Number of rows
    static int m; // Number of columns

    public static void main(String[] args) {
        n = Tools.getInt("Rows of matrix: "); // Input for number of rows
        m = Tools.getInt("Columns of matrix: "); // Input for number of columns
        int[][] matrixA = getIntArray(); // Get the matrix from user input
        System.out.println("Determinant of matrix is " + determinant(matrixA)); // Print determinant of the matrix
    }

    // Method to get matrix from user input
    private static int[][] getIntArray() {
        int[][] matrix = new int[n][m]; // Initialize matrix with given dimensions
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Tools.getInt("element of " + i + "x" + j + " :"); // Input for each element of matrix
            }
        }
        return matrix; // Return the matrix
    }

    // Method to calculate determinant of a square matrix
    public static int determinant(int[][] matrix) {
        if (matrix.length != matrix[0].length) { // Check if matrix is square
            throw new IllegalArgumentException("Matrix must be square");
        }
        return determinantRecursive(matrix); // Call the recursive method to calculate determinant
    }

    // Recursive method to calculate determinant of a square matrix
    private static int determinantRecursive(int[][] matrix) {
        int n = matrix.length; // Get the size of the matrix
        if (n == 1) {
            return matrix[0][0]; // Base case: If matrix is 1x1, return the only element
        } else if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]; // Base case: If matrix is 2x2, return the determinant
        } else {
            int det = 0;
            for (int i = 0; i < n; i++) {
                int[][] minor = new int[n - 1][n - 1]; // Initialize minor matrix
                for (int j = 1; j < n; j++) {
                    // Copy elements to minor matrix, excluding current row and column
                    System.arraycopy(matrix[j], 0, minor[j - 1], 0, i);
                    System.arraycopy(matrix[j], i + 1, minor[j - 1], i, n - i - 1);
                }
                // Calculate determinant recursively for each minor and accumulate
                det += (i % 2 == 0 ? 1 : -1) * matrix[0][i] * determinantRecursive(minor);
            }
            return det; // Return the determinant
        }
    }
}
