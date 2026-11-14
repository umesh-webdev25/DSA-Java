package PromlemSolving.Array;

public class sumClosest {
    static int getClosest(int arr[], int target){
        int n = arr.length;
        int closest = arr[0];
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            if (Math.abs(arr[i] - target) <
                    Math.abs(closest - target)) {
                closest = arr[i];
            }
        }
        return closest;
    }
    public static void main(String[] args) {
        int arr[] = {-1,2,1,-4};
        int target = 1;
        int r = getClosest(arr,target);
        System.out.println(r);

    }
}
