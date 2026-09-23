package maths;

public class getPowerOfNumber {
    static void findpower(int base,int power){
        int result = 1;
        for(int i=1; i<=power; i++){
           result = result * base;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int base = 2;
        int power = 3;
        findpower(base,power);
    }
}
