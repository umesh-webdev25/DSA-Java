package Array;

public class sumOf2DArray {
    public static void main(String[] args){
        int arr[][] = {{1,2,3},{1,2,3}};
        int l = arr.length;
        int sum=0;
        for(int i=0; i<l; i++){
            for(int j=0; j<arr[i].length; j++){
                int value = arr[i][j];
                sum = sum + value;
            }
        }
        System.out.print(sum);
    }

}
