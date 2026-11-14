//Print n to 1 Without Loop
// n decreasing order

package PromlemSolving.Recursion;

public class Fibonacci {
    static void printNos(int n) {
       if(n == 0){
           return;
       }
        System.out.print(n+" ");
       printNos(n -1);
    }

    public static void main(String[] args) {
        int n = 5;
        printNos(n);
    }
}
