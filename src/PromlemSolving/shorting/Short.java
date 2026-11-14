package PromlemSolving.shorting;

public class Short {
    static int[] getShort(int nums[]){
        int n = nums.length;
        for(int i=-0; i<n-1; i++){
            for (int j = 0; j < n - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,3,1,2};
        int result[] = getShort(arr);
        for(int num : result){
            System.out.print(num+" ");
        }
    }
}
