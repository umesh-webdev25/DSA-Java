package PromlemSolving.Array;

public class UniqueElement {
    static int getUniqueElement(int arr[]){
        int ans = 0;
        for(int num : arr){
            ans = ans ^ num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] ={2,3,3,4,5,4,5,1,0,1,0};
        int result = getUniqueElement(arr);
        System.out.println(result);
    }
}
