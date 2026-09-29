package Array;

public class ReversArray {
    static int[] ArrayRevers(int arr[]){
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int result[] = ArrayRevers(arr);
        for(int val : result)
        {
            System.out.print(val+" ");
        }
    }
}
