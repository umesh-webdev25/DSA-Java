// If F(n) is nth fibonacci number then , F(n) = F(n-1) + F(n-2) ; where F(0) = 0 and F(1) = 1
package PromlemSolving.Recursion;

public class NthFibonacci {
 static int getfibonacci(int n){
      if(n == 0){
          return 0;
      }
      if(n ==1){
          return 1;
      }
     return getfibonacci(n-1)+getfibonacci(n-2);
 }

    public static void main(String[] args) {
        int n = 3;
        int ans = getfibonacci(n);
        System.out.println(ans);
    }
}
