// Return Sum of +ve and -ve numbers
package PromlemSolving.Array;

public class SumPositiveNegative {
    static int[] getSum(int arr[]){
        int positivenum = 0;
        int nagativenum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                positivenum = positivenum + arr[i];
            } else if(arr[i] < 0){
                nagativenum = nagativenum + arr[i];
            }
        }
        int ans[] ={positivenum,nagativenum};
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {0,-1,-2,445,67,-97,45};
        int result[] = getSum(arr);
        System.out.println(result[0]);
        System.out.println(result[1]);

    }
}
