package Array;
import java.util.Scanner;
public class matrix2DArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Row = ");
        int row = sc.nextInt();

        System.out.print("Enter the Colunm = ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        int l=arr.length;

        //Taking input
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        //Printing Value
        for(int i=0; i<l; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
