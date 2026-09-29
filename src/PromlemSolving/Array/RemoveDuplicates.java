package PromlemSolving.Array;

public class RemoveDuplicates {
    static int Removeduplicat(int arr[]){
        int j =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int[] arr = {-5, -5, -3, -3, -1, -1};
        int result = Removeduplicat(arr);
        System.out.println(result);
    }
}
