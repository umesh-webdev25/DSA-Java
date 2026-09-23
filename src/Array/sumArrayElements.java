package Array;

public class sumArrayElements {
    public static void main(String[] args){
        int arr[] = {10,23,34,56,78};
        int l = arr.length;
        System.out.print("Array Elements - ");
        for(int i=0; i<l; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //sum of array element
        int sum = 0;
        for(int i=0; i<l; i++){
            sum = sum+arr[i];
        }
        System.out.print("Sum of Array Element = "+sum);
    }
}
