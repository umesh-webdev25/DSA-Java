package PromlemSolving.BinarySearch;

public class SearchalmostSortedArray {
    public int findTarget(int arr[], int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        while(s <= e){
            int mid = s+(e-s)/2;

            if(mid-1 >=0 && arr[mid-1] == target){
                return mid-1;
            }
            if(arr[mid] == target){
                return mid;
            }
            if(mid+1 <= n && arr[mid+1] == target){
                return mid+1;
            }

            if(target > arr[mid]){
                s = mid+2;
            }else{
                e = mid-2;
            }
        }
        return -1;
    }
    void main(){
        int arr[] = {10, 3, 40, 20, 50, 80, 70};
        int target = 40;
        int result = findTarget(arr,target);
        System.out.println(result);
    }
}
