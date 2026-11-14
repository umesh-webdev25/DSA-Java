package PromlemSolving.Array;
import java.util.*;
public class MissingElementsAnArrayofDuplicates {
    static List<Integer> getPostion(int nums[]){
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int index =0; index<n; index++){
            int value = Math.abs(nums[index]);
            int postion = value-1;
            if(nums[postion] > 0){
                nums[postion] = - nums[postion];
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                int IndexValue = i+1;
                list.add(IndexValue);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,5,5,3,6};
        List<Integer> list = getPostion(nums);
        System.out.println(list);

    }
}
