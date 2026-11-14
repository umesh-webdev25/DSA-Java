package PromlemSolving.shorting;

public class InsertionShort {
    static int[] getShort(int nums[]){
        int n = nums.length;
        for(int i=1; i<n; i++){
//            int curr = i;
            int prev = i-1;
            int currVlue = nums[i];
            while(prev >= 0 && currVlue < nums[prev]){
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = currVlue;
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,-3,1,2};
        int result[] = getShort(arr);
        for(int num : result){
            System.out.print(num+" ");
        }
    }
}
