package PromlemSolving.shorting;

public class SelectionShort {
    static int[] getShort(int nums[]){
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
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
