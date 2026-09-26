// Find the maximum element in an array
package PromlemSolving.Array;

public class FindMaximum {
    static int maxValue(int arr[]){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
               max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,445,67,-97,45};
        int result = maxValue(arr);
        System.out.println(result);

    }
}
