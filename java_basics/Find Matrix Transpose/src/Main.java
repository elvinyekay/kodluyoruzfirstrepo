public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] transposedMatrix = transpose(matrix);

        System.out.println("Original Matrix");
        printMatrix(matrix);
        System.out.println("=====");
        System.out.println("Transposed Matrix");
        printMatrix(transposedMatrix);
    }

    public static int[][] transpose(int[][] matrix) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int[][] result = new int[colCount][rowCount];

        for (int i = 0; i < colCount; i++) {
            for (int j = 0; j < rowCount; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}