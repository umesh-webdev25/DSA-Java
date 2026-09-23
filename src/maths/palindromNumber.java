package maths;

public class palindromNumber {
    static void palindeom(int num){
        int revNum = 0;
        int oldNum = num;
        while(num !=0 ){
            int digit = num %10;
            revNum = revNum * 10 + digit;
            num = num/10;
        }
        if(oldNum == revNum){
            System.out.println("Number is Palindrom");
        }else{
            System.out.println("Number is not Palindrom");
        }
    }
    public static void main(String[] args) {
        int num= 12321;
        palindeom(num);
    }
}
