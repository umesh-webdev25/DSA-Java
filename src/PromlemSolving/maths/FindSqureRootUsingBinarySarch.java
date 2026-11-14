package PromlemSolving.maths;

public class FindSqureRootUsingBinarySarch {
    public int getSQRT(int n){
        int s = 0;
        int e = n;
        int ans = -1;
       if(n ==0 ){
           return 0;
       }
        while(s < e){
            int mid = s+(e-s)/2;
            if(mid == n/mid){
                return mid;
            }else if(mid  > n/mid){
                e = mid -1;
            }else{
                ans = mid;
                s = mid +1;
            }
        }
        return ans;
    }
    void main(){
        int n = 56;
        int result = getSQRT(n);
        System.out.println(result);
    }
}
