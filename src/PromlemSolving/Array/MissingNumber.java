package PromlemSolving.Array;

public class MissingNumber {
    static int getMissingNumber(int arr[]){
        int n = arr.length;
        System.out.println(n);
        int expectNum = n*(n+1)/2;
        int acutalNum = 0;
        for(int num : arr){
            acutalNum += num;
        }
        int result = expectNum - acutalNum;
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {3,0,1,2,5};
        int result = getMissingNumber(arr);
        System.out.print(result);
    }
}
