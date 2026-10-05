package PromlemSolving.T2DArray;

public class Print2DArrayInwave {
    static int[] printWave(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        int result[] = new int[m * n];
        int k = 0;

        for (int col = 0; col < n; col++) {

            if (col % 2 == 1) {

                // bottom → top
                for (int row = m - 1; row >= 0; row--) {
                    result[k] = arr[row][col];
                    k++;
                }

            } else {

                // top → bottom
                for (int row = 0; row < m; row++) {
                    result[k] = arr[row][col];
                    k++;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4},
                {6, 7, 8, 9},
                {2, 3, 4, 5},
                {4, 6, 7, 10}
        };
        int[] result = printWave(arr);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
