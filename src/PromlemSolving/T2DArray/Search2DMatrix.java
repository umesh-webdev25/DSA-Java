package PromlemSolving.T2DArray;

public class Search2DMatrix {
    static boolean getSearchElement(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int s = 0;
        int e = m * n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            int row = mid / n;
            int col = mid % n;
            int val = matrix[row][col];

            if (val == target) {
                return true;
            } else if (val < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int t = 7;

        boolean r = getSearchElement(arr, t);
        System.out.println(r); // true
    }
}