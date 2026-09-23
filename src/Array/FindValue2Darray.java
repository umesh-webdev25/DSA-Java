package Array;

public class FindValue2Darray {
    public static void main(String[] args){
        int arr[][] = {
                {12, 23, 45, 67},
                {1, 4, 6, 8, 0, 3}
        };

        int target = 45;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {

                if(arr[i][j] == target) {
                    System.out.println("Row: " + i);
                    System.out.println("Column: " + j);
                }

            }
        }
    }
}
