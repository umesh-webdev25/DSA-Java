package PromlemSolving.T2DArray;
import java.util.*;
public class sumOfRow {
    static List<Integer> getsum(int arr[][]){
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            int sum =0;
            for(int j=0; j<arr.length; j++){
                sum = sum + arr[i][j];

            }
            list.add(sum);
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {1, 2, 3},{4,5,6}};
         List<Integer> result = getsum(arr);
        System.out.println(result);
    }
}
