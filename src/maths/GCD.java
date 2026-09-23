package maths;

public class GCD {
    static int getGCD(int a,int b){
        while (b !=0){
            int temp = b;              // temp = 12
            b = a % b;                 // b = 18% 12 = 6
            a = temp;                  // a = 12
        }
        return a;

    }
    public static void main(String[] args) {
        int a=18;
        int b=12;
        System.out.println("GCD of the two number = "+getGCD(a,b));
    }
}
