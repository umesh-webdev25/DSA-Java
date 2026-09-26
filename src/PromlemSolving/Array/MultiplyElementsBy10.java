// Multiply each element of array by 10
package PromlemSolving.Array;
public class MultiplyElementsBy10 {
    static int[] multiplay(int arr[]){          // function return the array
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] * 10;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int result[] = multiplay(arr);         // only the array store the value if funtion return the array
        for(int i=0; i<arr.length; i++){
            System.out.println(result[i]);
        }
    }
}
