package PromlemSolving.Array;

public class pivotIndex {
    static int getPivotIndex(int num[]){
        int n = num.length;
        int total = 0;
        int left = 0;

        for(int val : num){
            total+=val;
        }

        for(int i=0; i<n; i++){
            if(left == total-left-num[i]){
                return i;
            }
            left+=num[i];
        }
        return -1;
    }
      void main() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int result = getPivotIndex(nums);
        System.out.println(result);

    }
}
