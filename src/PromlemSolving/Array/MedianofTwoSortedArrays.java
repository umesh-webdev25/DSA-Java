package PromlemSolving.Array;

public class MedianofTwoSortedArrays {
    static double getMidian(int[] num1, int[] num2){
        int m = num1.length;
        int n = num2.length;

        int merge[] = new int[m+n];

        for(int i=0; i<m; i++){
            merge[i] = num1[i];
        }

        for(int i=0; i<n; i++){
            merge[i+m] = num2[i];
        }

        int l = merge.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - 1 - i; j++) {
                if (merge[j] > merge[j + 1]) {   // out of order, so swap
                    int temp = merge[j];
                    merge[j] = merge[j + 1];
                    merge[j + 1] = temp;
                }
            }
        }
//        for(int num : merge){
//            System.out.println(num);
//        }
        int mid = l/2;

        if (l % 2 == 1) {
            return merge[mid];
        }
        return (merge[mid - 1] + merge[mid]) / 2.0;
    }
    public static void main(String[] args) {
        int num1[] = {3,2};
        int num2[] = {4,1};

        double r = getMidian(num1,num2);
        System.out.println(r);
    }
}
