package PromlemSolving.Array;

public class ShortArray0and1 {
    static int[] getSortArray(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n -1;
        while(left < right){
            if(arr[left] == 1 && arr[right] == 0){
                arr[left] = 0;
                arr[right] = 1;
            } else if(arr[left] == 0)
            {
                left++;
            } else if(arr[right] == 1){
                right--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,1,0};
        int result[] = getSortArray(arr);
        for(int val : result){
            System.out.print(val+" ");
        }

    }
}
