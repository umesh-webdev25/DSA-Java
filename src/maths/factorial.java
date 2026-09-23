package maths;

public class factorial {
    static int getFact(int num){
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact*i;
        }
      return fact;
    }
    public static void main(String[] args) {
        int num = 5;
        int ans = getFact(num);
        System.out.println(ans);
    }
}
