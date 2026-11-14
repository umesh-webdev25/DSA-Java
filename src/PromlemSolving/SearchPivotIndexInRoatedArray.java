package PromlemSolving;

public class SearchPivotIndexInRoatedArray {
    static int getPivoteIndex(int arr[]){

        int n = arr.length;
        int start =0;
        int end = n-1;
        while(start < end){
            int mid = start+(end-start)/2;
            if(arr[mid] > arr[mid+1]){

                start = mid+1;

            }else{
                end = mid-1;
            }
        }

        return  start;
    }
    public static void main(String[] args) {
        int arr[] = {6, 7 ,1, 2, 3, 4 ,5 };
        int result = getPivoteIndex(arr);
        System.out.println(result);

    }
}
