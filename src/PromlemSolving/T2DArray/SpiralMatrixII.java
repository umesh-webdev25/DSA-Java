package PromlemSolving.T2DArray;

public class SpiralMatrixII {
    static int[][] getSpiral(int n){
        int matrix[][] = new int[n][n];

        int lm = matrix.length;
        int ln = matrix[0].length;

        int sRow = 0;
        int eRow = lm-1;
        int sCol = 0;
        int eCol = ln-1;
        int value = 1;

        while (sRow <= eRow && sCol <= eCol) {

            // Left to right (top)
            for (int col = sCol; col <= eCol; col++) {
                matrix[sRow][col] = value++;
            }
            sRow++;

            // Top to bottom (right)
            for (int row = sRow; row <= eRow; row++) {
                matrix[row][eCol] = value++;
            }
            eCol--;

            // Right to left (bottom)
            if (sRow <= eRow) {
                for (int col = eCol; col >= sCol; col--) {
                    matrix[eRow][col] = value++;
                }
                eRow--;
            }

            // Bottom to top (left)
            if (sCol <= eCol) {
                for (int row = eRow; row >= sRow; row--) {
                    matrix[row][sCol] = value++;
                }
                sCol++;
            }
        }
        return matrix;

    }
    public static void main(String[] args) {
        int matrix = 3;
        int result[][] = getSpiral(matrix);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
