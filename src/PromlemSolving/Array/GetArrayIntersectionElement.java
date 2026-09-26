// Print Array Intersection element
package PromlemSolving.Array;

import java.util.*;

public class GetArrayIntersectionElement {
    static List<Integer> Intersection(int arr1[],int arr2[]){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                 list.add(arr1[i]);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr1[] = {10,20,30,40,50,60};
        int arr2[] = {50,60,70,80,90,100};
        List<Integer> resutl = Intersection(arr1, arr2);
        System.out.println(resutl);

    }
}
