package PromlemSolving.Array;
import java.util.*;
public class ThreeSumArray {

    static int[] getThreeSum(int arr[], int t) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == t) {
                        return new int[]{arr[i], arr[j], arr[k]};
                    }
                }
            }
        }

        return new int[]{-1, -1, -1};
    }

   // using the List and HashSet

//    public List<List<Integer>> threeSum(int[] nums, int t) {
//        Set<List<Integer>> set = new HashSet<>();
//        int n = nums.length;
//        for(int i=0; i<n; i++){
//            for(int j=i+1; j<n; j++){
//                for(int k=i+1; k<n; k++){
//                    if (nums[i] + nums[j] + nums[k] == t) {
//                        List<Integer> temp = new ArrayList<>();
//                        temp.add(nums[i]);
//                        temp.add(nums[j]);
//                        temp.add(nums[k]);
//                        Collections.sort(temp);
//                        set.add(temp);
//
//                    }
//                }
//            }
//        }
//        return new ArrayList<>(set);
//
//    }


    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        int target = 12;

        int result[] = getThreeSum(arr, target);

        System.out.println(
                result[0] + ", " +
                        result[1] + ", " +
                        result[2]
        );
    }
}