package PromlemSolving.Array;

public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    void main(){
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(nums,target);
        System.out.println(ans);
    }
}
