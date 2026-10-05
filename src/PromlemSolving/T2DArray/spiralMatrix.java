package PromlemSolving.T2DArray;
import java.util.*;
public class spiralMatrix {
    static List<Integer> getSpiral(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;

        int StartRow = 0;
        int EndRow = m - 1;
        int Startcol = 0;
        int Endcol = n - 1;

        List<Integer> list = new ArrayList<>();

        while (StartRow <= EndRow && Startcol <= Endcol) {
            // left - > right (top side of the matrix)  (print the row)
            for (int col = Startcol; col <= Endcol; col++) {
                list.add(arr[StartRow][col]);
            }
            StartRow++;

            // top - bottom (right side of the matrix) (print the col)
            for (int row = StartRow; row <= EndRow; row++) {
                list.add(arr[row][Endcol]);
            }
            Endcol--;
            // right - > left (bottom side of the matrix) (print row)

            if (StartRow <= EndRow) {
                for (int col = Endcol; col >= Startcol; col--) {
                    list.add(arr[EndRow][col]);
                }
                EndRow--;
            }
            // bottom -> top (left side of the matrix) (print the col)
            if (Startcol <= Endcol) {
                for (int row = EndRow; row >= StartRow; row--) {
                    list.add(arr[row][Startcol]);
                }
                Startcol++;
            }
        }
        return list;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {12, 45, 7, 23},
                {56, 8, 34, 19},
                {41, 67, 3, 29},
                {15, 52, 38, 76}
        };

        // Original matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Spiral list
        List<Integer> list = getSpiral(arr);

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}