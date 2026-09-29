package PromlemSolving.Array.ArrayManipulation;
public class ReversArray {
    static int[] ReverceArray(int arr[]){
        int left= 0;   // fist index left side
        int right= arr.length-1;  // last index
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
           left++;
           right--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int result[] = ReverceArray(arr);
        for(int val : result){
            System.out.print(val+" ");
        }
    }
}
