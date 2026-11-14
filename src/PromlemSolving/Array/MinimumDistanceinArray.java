package PromlemSolving.Array;

public class MinimumDistanceinArray {
    static int getMin(int arr[],int x,int y){
        int n = arr.length;
        int min = 0;
        for(int i=x; i<y;i++){
            if(i < min){
                return min;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 2};
        int x = 1;
        int y = 2;
        int rsult = getMin(arr,x,y);
        System.out.println(rsult);

    }
}
