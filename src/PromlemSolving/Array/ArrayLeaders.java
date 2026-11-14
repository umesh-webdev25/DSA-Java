package PromlemSolving.Array;

public class ArrayLeaders {
    static int[] getLeades(int arr[]){
        int n = arr.length;

        int k = 0;
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            boolean isleader = true;
            for(int j=i+1; j<n; j++){
                if(arr[i] < arr[j]){
                   isleader = false;
                   break;
                }
            }
            if (isleader) {
                nums[k] = arr[i];
                k++;
            }

        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        int ans[] = getLeades(arr);
        int n = arr.length;
        for(int i=0; i<3; i++){
            System.out.println(ans[i]);
        }
    }
}
