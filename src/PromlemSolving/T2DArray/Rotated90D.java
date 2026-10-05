package PromlemSolving.T2DArray;

public class Rotated90D {
    static int[][] getRotation(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        int result[][] = new int[n][m];
        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                result[col][row] = arr[row][col];
            }
        }
        for(int row=0; row<result.length; row++){
            int start = 0;
            int end = result.length-1;
            while(start < end){
                int temp = result[row][start];
                result[row][start] = result[row][end];
                result[row][end] = temp;
                start++;
                end--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();System.out.println();
        int result[][] = getRotation(arr);
        for(int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
