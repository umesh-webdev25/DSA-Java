package PromlemSolving.Array.ArrayManipulation;

public class FindMode {
    static int FindMode(int arr[]){
        int maxfeq = 0;
        int maxElement = arr[0];
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count > maxfeq){
                maxfeq = count;
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 5, 4, 3, 4, 6, 7, 7, 7, 7};
        int resutl = FindMode(arr);
        System.out.println(resutl);
    }
}
