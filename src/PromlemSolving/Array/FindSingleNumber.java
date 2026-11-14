package PromlemSolving.Array;

public class FindSingleNumber {
    static int geSingle(int nums[]){
        int n = nums.length;

        for(int i=0; i<n; i++){
            boolean found = false;
            for(int j=0; j<n; j++){
                if (i != j && nums[i] == nums[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return nums[i];   // the single element
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,1,2,4};
        int r = geSingle(arr);
        System.out.println(r);
    }
}
