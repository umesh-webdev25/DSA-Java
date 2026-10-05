package PromlemSolving.Array;

public class pivotIndex {
    static int getPivotIndex(int num[]){
        int n = num.length;
        if (n == 0) return -1;

        int leftsum[] = new int[n];
        int rightsum[] = new int[n];

        leftsum[0] = num[0];
        for(int i = 1; i < n; i++){
            leftsum[i] = leftsum[i-1] + num[i];
        }

        rightsum[n-1] = num[n-1];
        for(int i = n-2; i >= 0; i--){
            rightsum[i] = rightsum[i+1] + num[i];
        }

        for(int i = 0; i < n; i++){
            if(leftsum[i] == rightsum[i]){
                return i;
            }
        }

        // FIX 4: Return -1 instead of 0
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int result = getPivotIndex(nums);
        System.out.println(result);

    }
}
