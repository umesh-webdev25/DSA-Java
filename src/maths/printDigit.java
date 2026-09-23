package maths;

public class printDigit {
    static void PrintDigit(int num){
        while(num !=0 ){
            int digit = num %10;
            System.out.println(digit);
            num = num /10;
        }
    }

    public static void main(String[] args) {
        int num = 12345;
       PrintDigit(num);
    }
}
