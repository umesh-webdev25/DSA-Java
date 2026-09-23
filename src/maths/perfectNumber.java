package maths;

public class perfectNumber {
    static void checkperfectnumber(int num){
        int sum =0;
        int oldnum = num;
         for(int i=1; i<num; i++){
             if(num % i == 0){
                 sum = sum +i;
             }
         }
         if(oldnum == sum){
             System.out.println(sum+" is perfect number");
         }else{
             System.out.println(sum+" is not perfect number");
         }
    }
    public static void main(String[] args) {
        int num = 28;
       checkperfectnumber(num);
    }
}
