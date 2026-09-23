package Array;

public class maxValue2Darray {
    public static void main(String[] args){
        int arr[][]={{12,23,45,67},{1,-4,6,8,0}};
        int maxValue = arr[0][0];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]>maxValue){
                    maxValue = arr[i][j];
                }
            }
        }
        System.out.print("Maximum value of 2D Array = "+maxValue);
    }
}
