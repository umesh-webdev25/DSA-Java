// Find the average of array elements
package PromlemSolving.Array;

public class FindAverage {
    static double  avrage (int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum +arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
       double result =  avrage(arr);
        System.out.println(result);

    }
}
