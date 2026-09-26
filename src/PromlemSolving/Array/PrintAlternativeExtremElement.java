package PromlemSolving.Array;
import java.util.*;
public class PrintAlternativeExtremElement {
    static List<Integer> PrintAlternative(int arr[]){
        int left = 0;
        int right = arr.length-1;
        List<Integer> result = new ArrayList<>();
        while(left <= right){
            result.add(arr[left]);
            left++;
            if(left <= right){
                result.add(arr[right]);
                right--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        System.out.print("[");
        for(int val : arr){
            System.out.print(val+",");
        }
        System.out.print("]");
        System.out.println();
        List<Integer> result = PrintAlternative(arr);
        System.out.println(result);

    }
}
