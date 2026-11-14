package PromlemSolving.Array;

public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
//       int n = nums.length;
//       int answer[] = new int[n];
//       for(int i=0; i<n; i++){
//           int product = 1;
//           for(int j = 0; j<n; j++){
//                  if(i != j){
//                      product *= nums[j];
//                  }
//           }
//           answer[i] = product;
//       }
//       return answer;


        int n = nums.length;
        int[] answer = new int[n];

        int prefix = 1;

        // Calculate products on the left
        for (int i = 0; i < n; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;

        // Multiply by products on the right
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;
    }
    void main()
    {
        int nums[] = {1,2,3,4};
        int answer[] = productExceptSelf(nums);
        for(int val : answer){
            System.out.println(val);
        }
    }
}
