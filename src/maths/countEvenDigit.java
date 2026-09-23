package maths;

public class countEvenDigit {
    static void countEventdigit(int num){
        int count =0;
        while(num !=0){
            int digit = num % 10;
            if(digit % 2 == 0){
                count++;
            }
            num = num/10;
        }
        System.out.println("Even digit in the numbers = "+count);
    }
    public static void main(String[] args) {
        int num= 123456789;
        countEventdigit(num);
    }
}
