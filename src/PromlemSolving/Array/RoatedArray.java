package PromlemSolving.Array;

public class RoatedArray {

    static int[] reverce(int arr[] , int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    static int[] getRoatedArray(int arr[], int k){
        int n = arr.length;
        k = k%n;
        reverce(arr,0,n-1);
        reverce(arr,0, k-1);
        reverce(arr,k,n-1);
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 2;
        int result[] = getRoatedArray(arr,k);
        for(int val : result){
            System.out.print(val+" ");
        }
    }
}
