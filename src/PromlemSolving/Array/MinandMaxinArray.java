package PromlemSolving.Array;
import java.util.*;
public class MinandMaxinArray {
    static ArrayList<Integer> getMinMax(int[] arr) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        int n = arr.length;
        int min = arr[0];
        int max = arr[0];

        for(int i=0; i<n; i++){
            if(arr[i] < min){
                min = arr[i];

            } else if(arr[i] > max){
                max = arr[i];

            }
        }

            list.add(max);
            list.add(min);
        return list;
    }

public static void main(String[] args) {
     int arr[] = {1,2,3,4,5,6,7,8,9};
     List<Integer> list = getMinMax(arr);
    System.out.println(list);
    }
}
