package PromlemSolving.Array;

public class BinarySearchTarget {
    public int search(int[] nums, int target){
        int n = nums.length;
        int s = 0;
        int e = n-1;

        while(s <= e){
            int mid = s+(e-s)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                s = mid+1;
            } else if(mid > target) {
                e = mid -1;
            }
        }
        return -1;

    }
    void main(){
        int nums[] = {-1,0,3,5,9,12};
        int target = 3;
        int resutl = search(nums,target);
        System.out.println(resutl);
    }
}
