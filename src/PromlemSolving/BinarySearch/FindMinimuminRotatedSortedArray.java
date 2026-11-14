package PromlemSolving.BinarySearch;

public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] > nums[e]) {
                s = mid + 1;
            }
            else {
                e = mid;
            }
        }
        return nums[s];
    }
    void main(){
        int nums[] = {3,4,5,1,2};
        int result = findMin(nums);
        System.out.println(result);
    }
}
