package PromlemSolving.Array;

import java.util.*;

public class FirstAndSeondMaxValue{
    public ArrayList<Integer> minAnd2ndMin(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] > max){
                secondmax = max;
                max = arr[i];
            }else if(arr[i] > secondmax){
                secondmax = arr[i];
            }

        }
        list.add(max);
        list.add(secondmax);
        return list;
    }
    void main(){
        int arr[] = {12, 23, 41, 45, 67, 89};
        ArrayList<Integer> list = minAnd2ndMin(arr);
        System.out.println(list);
    }
}

