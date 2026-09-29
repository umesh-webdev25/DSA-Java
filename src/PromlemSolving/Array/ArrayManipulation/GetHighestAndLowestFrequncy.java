package PromlemSolving.Array.ArrayManipulation;

public class GetHighestAndLowestFrequncy {
    static int[] getFrequncy(int arr[]){
        int maxfeq = 0;
        int maxElement = arr[0];

        int minfeq = arr.length;
        int minElement = arr[0];

        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count > maxfeq){
                maxfeq = count;
                maxElement = arr[i];
            }

            if(count < minfeq){
                minfeq = count;
                minElement = arr[i];
            }
        }


        return new int[] {maxElement, minElement};
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 5, 4, 3, 4, 6, 7, 7, 7, 7};
        int result[] = getFrequncy(arr);
        System.out.print("Max = "+result[0]+" ");
        System.out.print("Min = "+result[1]);


    }
}
