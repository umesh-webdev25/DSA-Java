package PromlemSolving.Array;
import java.util.*;
public class DuplicatesinLimitedRangeArray {
    static ArrayList<Integer> findDuplicates(int[] arr){
          int n = arr.length;
          ArrayList<Integer> list=new ArrayList<>();
          for(int i=0; i<n; i++){
              for(int j=i+1; j<n;j++){
                  if(arr[i] == arr[j]){
                      if(!list.contains(arr[i])){
                          list.add(arr[i]);
                      }
                      break;
                  }
              }

          }
          return list;
    }
    public static void main(String[] args) {
        int arr[] ={2, 3, 1, 2, 3};
        ArrayList<Integer> list = findDuplicates(arr);
        System.out.println(list);
    }
}
