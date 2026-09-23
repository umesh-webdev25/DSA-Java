package maths;

public class countDigitOfNumber {
    static void countDigit(int num){
        int count = 0;
        while(num !=0){
            int digit = num %10;
            count++;
            num = num/10;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int num= 12345;
        countDigit(num);
    }
}
