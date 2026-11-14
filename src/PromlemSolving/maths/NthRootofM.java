package PromlemSolving.maths;

public class NthRootofM {
    public int nthRoot(int n, int m){
        for (int i = 1; i <= m; i++) {
            long temp = 1;

            for (int j = 0; j < n; j++) {
                temp *= i;

                if (temp > m) {
                    break;
                }
            }

            if (temp == m) {
                return i;
            }

            if (temp > m) {
                return -1;
            }
        }

        return -1;
    }
    void main(){
        int n = 3;
        int m = 8;

        int ans = nthRoot(n,m);
        System.out.println(ans);
    }
}
