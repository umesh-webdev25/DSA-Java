package PromlemSolving.Array;
import java.util.*;
public class FirstAndSeondMinValue {
    public ArrayList<Integer> minAnd2ndMin(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();

        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                secondmin = min;
                min = arr[i];
            } else if (arr[i] < secondmin ) {
                secondmin = arr[i];
            }
        }
        list.add(min);
        list.add(secondmin);
        return list;
    }
    void main(){
        int arr[] = {12, 23, 41, 45, 67, 89};
        ArrayList<Integer> list = minAnd2ndMin(arr);
        System.out.println(list);
    }
}
