// Find first Unsorted Element in Array
package PromlemSolving.Array;
import java.util.*;
public class FindFirstUnsorted {
    static List<Integer> getUnshort(int arr[]){
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                result.add(arr[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {20,30,60,40,50,10};
        List<Integer> result = getUnshort(arr);
        System.out.println(result);

    }
}
