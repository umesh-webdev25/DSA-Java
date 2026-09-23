package Array;

public class maxValueArray {
    public static void main(String[] args){
        int arr[] = {12,23,41,45,67,89};
        int l = arr.length;
        System.out.print("Array Elements = ");
        //Printing the Array Element
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
        //Find the max Elemement for the Array
        int max=arr[0];
        for(int i=0; i<l; i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        System.out.println("Maximum value = " + max);
    }
}
