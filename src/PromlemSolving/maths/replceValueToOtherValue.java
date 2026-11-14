package PromlemSolving.maths;

public class replceValueToOtherValue {
 static int replce(int n, int t){
     if(n==0){
         return 0;
     }
     int result = 0;
     int place =1;
     while( n != 0){
         int digit = n %10;
         if(digit == 0){
             digit = t;
         }
         result += digit *place;
         place = place * 10;
         n = n/10;
     }
     return result;

 }
    public static void main(String[] args) {
        int n = 1010;
        int t = 5;
        int ans = replce(n,t);
        System.out.println(ans);
    }
}
