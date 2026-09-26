// Swap Alternate Elements in an Array
package PromlemSolving.Array;

public class SwapAlternativeElement {
    static int[] getAlterNativeSwampElement(int arr[]){
        for(int i=0; i<arr.length-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int result[] = getAlterNativeSwampElement(arr);
        for(int val : result){
            System.out.print(val+" ");
        }
    }

}
