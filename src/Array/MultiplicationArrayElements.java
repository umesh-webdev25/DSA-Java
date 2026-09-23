package Array;

public class MultiplicationArrayElements {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int l = arr.length;
        System.out.print("Array Elements - ");
        for(int i=0; i<l; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //sum of array element
        int sum = 1;
        for(int i=0; i<l; i++){
            sum = sum*arr[i];
        }
        System.out.print("Sum of Array Element = "+sum);
    }
}
