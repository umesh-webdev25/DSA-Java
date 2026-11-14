package PromlemSolving.BinarySearch;

public class BookAllocationProblem {
    static boolean isValidAnser(int arr[], int k ,int maxpage){
        int studentcount = 1;
        int pages = 0;
        for(int i =0; i<arr.length; i++){
            if(pages + arr[i] <= maxpage){
                pages = pages + arr[i];
            }else {
                studentcount++;
                if(studentcount > k || arr[i] > maxpage){
                    return false;
                }else{
                    pages = 0;
                    pages = pages + arr[i];
                }
            }
        }
        return true;
    }
    public int findPages(int[] arr, int k){
        int n = arr.length;
        int s = 1;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
        }
        int e = sum;
        int ans=-1;
        while(s <=e){
            int mid = s+(e-s)/2;

            if(isValidAnser(arr,k,mid))
            {
                ans = mid;
                e = mid -1;
            }else{
                s = mid + 1;
            }
        }
        return ans;
    }
    void main(){
        int arr[] = {12, 34, 67, 90};
        int k = 2;
        int result = findPages(arr,k);
        System.out.println(result);
    }
}
