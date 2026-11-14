package PromlemSolving.BinarySearch;

public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
          int n = nums1.length;
          int m = nums2.length;
          int arr3[] = new int[n+m];

        for (int i = 0; i < n; i++) {
            arr3[i] = nums1[i];
        }

        for (int i = 0; i < m; i++) {
            arr3[n + i] = nums2[i];
        }

        for(int i = 0; i < arr3.length; i++){
            for(int j = 0; j < arr3.length - 1; j++){
                if(arr3[j] > arr3[j + 1]){
                    int temp = arr3[j];
                    arr3[j] = arr3[j + 1];
                    arr3[j + 1] = temp;
                }
            }
        }
        int mid = arr3.length / 2;

        if (arr3.length % 2 == 1) {
            return arr3[mid];
        } else {
            return (arr3[mid - 1] + arr3[mid]) / 2.0;
        }
    }
    void main(){
        int nums1[] = {1,3};
        int nums2[] = {2};
         double ans =findMedianSortedArrays(nums1,nums2);
        System.out.println(ans);
    }
}
