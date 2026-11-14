package PromlemSolving.Array;

public class MoveAllZeroestoEnd {
    static void movezero(int arr[]){
        int n = arr.length;
        int k=0;
//        int m = arr.length;
//        int num1[] = new int[n];
//        int num2[] = new int[m];
//        int arr2[] = new int[n];
//        int k=0;
//        int z=0;
//
//        for(int i=0; i<n; i++){
//            if(arr[i] == 0){
//                num2[z] = arr[i];
//                z++;
//            }else{
//                num1[k] = arr[i];
//                k++;
//            }
//        }
//
//        for (int i = 0; i < k; i++) {
//            arr2[i] = num1[i];
//        }
//
//        for (int i = 0; i < z; i++) {
//            arr2[k + i] = num2[i];
//        }
//
//        for (int val : arr2) {
//            System.out.print(val + " ");
//        }


        for(int i=0; i<n; i++){
            if(arr[i] !=0){
                arr[k] = arr[i];
                k++;
            }
        }
        while (k < n){
            arr[k] =0;
            k++;
        }

         for(int val : arr){
             System.out.print(val+" ");
         }


    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        movezero(arr);
    }
}
