package PromlemSolving.maths;

public class MedianofArray {
    static double getMid(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
//        for(int val : arr){
//            System.out.println(val);
//        }
        int start = 0;
        int end  = arr.length-1;
        double mid = arr[(start + end) /2];
        return mid;
    }
    public static void main(String[] args) {
        int arr[] = {90, 100, 78, 89, 67};
        double ans = getMid(arr);
        System.out.println(ans);
    }
}
