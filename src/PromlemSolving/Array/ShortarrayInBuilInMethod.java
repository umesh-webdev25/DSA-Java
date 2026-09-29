package PromlemSolving.Array;
import java.util.Arrays;
public class ShortarrayInBuilInMethod {
    static int[] shortValue(int arr[]){
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,0,0,1,1};
        int result[] = shortValue(arr);
        for(int val : result){
            System.out.print(val+"  ");
        }

    }
}
