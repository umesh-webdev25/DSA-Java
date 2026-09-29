package PromlemSolving.Array.ArrayManipulation;
import java.util.*;
public class PrintUnioOfArray {
    static Set<Integer> Union(int arr1[], int arr2[]){
        Set<Integer> set = new HashSet<>();
        for(int num : arr1){
            set.add(num);
        }
        for(int num : arr2){
            set.add(num);
        }
        return set;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {1,2,3,4,5,6,7,8,9,10};
        Set<Integer> set = Union(arr1, arr2);
        System.out.println(set);
    }
}
