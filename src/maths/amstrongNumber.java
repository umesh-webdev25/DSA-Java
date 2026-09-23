package maths;

public class amstrongNumber {
    static void checkasmtongnumber(int num){
        int sum = 0;
        int oldNum = num;
        while(num !=0){
            int digit = num % 10;
            sum += digit*digit*digit;
            num = num/10;
        }if(oldNum == sum){
            System.out.println("amstrong number");
        }else
        {
            System.out.println("not amstrong number");
        }
    }
    public static void main(String[] args) {
        int num = 153;
        checkasmtongnumber(num);
    }
}
