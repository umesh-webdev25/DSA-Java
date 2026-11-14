package PromlemSolving.Array;

import java.util.*;
public class AlternatePositiveNegative {
    static void getAlternative(ArrayList<Integer> arr){
      ArrayList<Integer> pos = new ArrayList<>();
      ArrayList<Integer> nag = new ArrayList<>();
      for(int val : arr){
          if(val >= 0){
              pos.add(val);
          }else{
              nag.add(val);
          }
      }
        ArrayList<Integer> result = new ArrayList<>();
        int maxSize = Math.max(pos.size(), nag.size());

        for(int i=0; i<maxSize; i++){
            if( i < pos.size()){
                result.add(pos.get(i));
            }
            if(i < nag.size()){
                result.add(nag.get(i));
            }
        }
        arr.clear();
        arr.addAll(result);
        System.out.println(result);

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(9, 4, -2, -1, 5, 0, -5, -3, 2));

        // Call the method
         getAlternative(arr);
    }
}
