package PromlemSolving.Array;

public class MaximumSubarray {
    public int getMaximumSubarray(int nums[]){
        int n = nums.length;
        int maxsub = nums[0];

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum = 0;
                for(int k = i; k<=j; k++){
                    sum+=nums[k];
                }

                if(sum > maxsub){
                    maxsub = sum;
                }
            }
        }
        return maxsub;
    }
    void main(){
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = getMaximumSubarray(nums);
        System.out.println(ans);
    }
}
