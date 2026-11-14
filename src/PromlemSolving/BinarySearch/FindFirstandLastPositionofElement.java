package PromlemSolving.BinarySearch;

public class FindFirstandLastPositionofElement {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;

        int s = 0;
        int e = nums.length - 1;

        // Find first occurrence
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                first = mid;
                e = mid - 1;
            }
            else if (nums[mid] > target) {
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }

        // Find last occurrence
        s = 0;
        e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                last = mid;
                s = mid + 1;
            }
            else if (nums[mid] > target) {
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }

        return new int[]{first, last};
    }
    void main(){
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        int result[] = searchRange(nums,target);
        for(int val : result){
            System.out.println(val);
        }
    }
}
