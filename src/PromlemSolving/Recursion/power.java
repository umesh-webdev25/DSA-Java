package PromlemSolving.Recursion;

public class power {
    static int getpowe(int x, int n){
        if(n ==0){
            return 1;
        }
        return x * getpowe(x,n-1);
    }
    public static void main(String[] args) {
        int m = 2;
        int n = 9;
        int ans = getpowe(m,n);
        System.out.println(ans);
    }
}
