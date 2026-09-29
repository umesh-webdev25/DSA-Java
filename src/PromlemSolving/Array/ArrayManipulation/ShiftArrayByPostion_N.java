package PromlemSolving.Array.ArrayManipulation;

public class ShiftArrayByPostion_N {
    static int[] shift(int arr[],int p){
       for(int j=0; j<p; j++){
           int n = arr.length;
           int temp = arr[n-1];
           for(int i=n-1; i>0; i--){
               arr[i] = arr[i-1];
           }
           arr[0] = temp;
       }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80};
        int postion = 2;
        int result[] = shift(arr,postion);
        for(int val : result){
            System.out.print(val+" ");
        }


    }
}
