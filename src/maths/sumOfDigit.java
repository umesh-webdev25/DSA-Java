package maths;

public class sumOfDigit {
    static int sumdigit(int num){
      int sum = 0;
      while(num != 0){
          int digit = num % 10;
          sum = sum + digit;
          num = num/10;
      }
       return sum;
    }
    public static void main(String[] args) {
        int num = 12345;
        int ans = sumdigit(num);
        System.out.println("sum of the digit = "+ans);
    }
}
