package maths;

public class reversNumber {
    static int reverDigit(int num){
        int revNum = 0;
        while(num != 0){
            int digit = num %10;
            revNum = revNum*10+digit;
            num = num / 10;
        }
        return revNum;
    }
    public static void main(String[] args) {
        int num = -12345;
        int ans = reverDigit(num);
        System.out.println(ans);
    }
}
