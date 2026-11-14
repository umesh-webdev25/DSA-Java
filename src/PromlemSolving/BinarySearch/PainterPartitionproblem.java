package PromlemSolving.BinarySearch;

public class PainterPartitionproblem {

    static boolean isValidAnser(int arr[], int maxlenght , int k){
           int paintercont = 1;
           int painterlangth = 0;
           int n = arr.length;
           for(int i=0; i<n; i++){
               if(painterlangth + arr[i] <= maxlenght){
                  painterlangth = painterlangth + arr[i];
               }else {
                   paintercont++;
                   painterlangth = 0;
                   if(paintercont> k || arr[i] > maxlenght){
                       return false;
                   }else
                   {
                       painterlangth = painterlangth + arr[i];
                   }
               }
           }
           return true;
    }

    public int minTime(int[] arr, int k){
        int sum = 0;
        int n = arr.length;

        for(int i =0; i<n; i++){
            sum+=arr[i];
        }

        int s = 0;
        int e = sum;
        int ans = -1;

        while(s <= e){
            int mid = s+(e-s)/2;

            if(isValidAnser(arr,mid,k)){
                ans = mid;
                e = mid-1;
            }else{
                s = mid +1;
            }
        }
        return ans;
    }
    void main(){
        int arr[] = {5, 10, 30, 20, 15};
        int k = 3;
        int ans = minTime(arr,k);
        System.out.println(ans);
    }
}
