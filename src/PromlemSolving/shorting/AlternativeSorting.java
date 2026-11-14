package PromlemSolving.shorting;
import java.util.*;
public class AlternativeSorting {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
       int left = 0;
       int right = arr.length-1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        while (left <= right) {
            list.add(arr[right--]); // Maximum
            if (left <= right) {
                list.add(arr[left++]); // Minimum
            }
        }

   return list;
    }
    void main(){
        int arr[] ={7, 1, 2, 3, 4, 5, 6};
        ArrayList<Integer> list = alternateSort(arr);
        System.out.println(list);
    }
}
