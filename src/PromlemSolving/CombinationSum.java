package PromlemSolving;
import java.util.*;
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> result = new ArrayList<>();

         for(int i =0; i<n; i++){
             for(int j = i+i; j<n; j++){
                 for(int k = j+1; k<n; k++){
                     if (candidates[i] + candidates[j] + candidates[k] == target) {
                         List<Integer> combination = new ArrayList<>();

                         combination.add(candidates[i]);
                         combination.add(candidates[j]);
                         combination.add(candidates[k]);

                         result.add(combination);
                     }
                 }
             }
         }
        for (int i = 0; i < n; i++) {
            if (candidates[i] == target) {
                List<Integer> combination = new ArrayList<>();
                combination.add(candidates[i]);
                result.add(combination);
            }
        }
  return result;
    }
    void main(){
        int candidates[] = {2,3,5};
        int target = 8;
        List<List<Integer>> result = combinationSum(candidates,target);
        System.out.println(result);

    }
}
