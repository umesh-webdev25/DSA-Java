package PromlemSolving.shorting;

import java.util.*;

public class AtleastTwoGreater {

    public  ArrayList<Integer> findElements(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n-2; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list);
        return list;
    }

     void main() {
        int[] arr = {2, 8, 7, 1, 5};
        ArrayList<Integer> list = findElements(arr);
         System.out.println(list);

    }
}