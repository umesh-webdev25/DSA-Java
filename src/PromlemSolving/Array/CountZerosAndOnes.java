// Count the number of Zeroes and Ones
package PromlemSolving.Array;

public class CountZerosAndOnes {
    static int[] count(int arr[]){
        int zero = 0;
        int one = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zero++;
            } else if(arr[i] == 1){
                one++;
            }
        }
        int ans[] = {one,zero};
        return  ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,0,5,6,1,0,4,0,5,6,1};
        int result[] = count(arr);
        System.out.println("One = " + result[0]);
        System.out.println("Zero = " + result[1]);
    }
}
