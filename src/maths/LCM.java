package maths;

public class LCM {
    static int getGDC(int a,int b){
        while (b !=0){
            int temp = b;              // temp = 12
            b = a % b;                 // b = 18% 12 = 6
            a = temp;                  // a = 12
        }

       return a;

    }
    static int getLCM(int a,int b){

        return (a*b)/getGDC(a,b);
    }
    public static void main(String[] args) {
        int a=18;
        int b=12;
        System.out.println("GCD of the two number = "+getLCM(a,b));
    }
}
