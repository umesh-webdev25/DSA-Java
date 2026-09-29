package PromlemSolving.Array;
import java.util.*;
public class FistRepettingElement {
    static int getRepet(int nums[]){

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={0,1,2,3,4,5,6,7,4,8,9,0,4,5,6,4,1,2};
        int result = getRepet(arr);
        System.out.print(result);
    }
}
