package PromlemSolving.BinarySearch;

public class MaximumWoodCollection {
    boolean isValidate(int arr[], int m, int maxhight) {
        long totalwoodcollection = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxhight) {
                int currwoodcollection = arr[i] - maxhight;

                totalwoodcollection += currwoodcollection;
            }
        }
        if (totalwoodcollection >= m) {
            return true;
        } else {
            return false;
        }
    }

    int maxHeight(int[] arr, int m) {
        int n = arr.length;
        int s = 0;
        int max = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int e = max;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isValidate(arr, m, mid)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    void main(){
        int arr[] = {20, 15, 10, 17};
        int m = 7;
        int result = maxHeight(arr,m);
        System.out.println(result);
    }
}
