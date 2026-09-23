package maths;

public class allPrimenumber {
    static boolean isPrimnumber(int num){
        for(int i=2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    static void getAllPrimNUmber(int num){
       for(int i = 2; i<num; i++){
           boolean isPrime = isPrimnumber(i);
           if (isPrime == true)
           {
               System.out.println(i);
           }
       }
    }
    public static void main(String[] args) {
        int num = 10;
        getAllPrimNUmber(num);
    }

}
