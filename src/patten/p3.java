package patten;

public class p3 {
    static void sub(int x){
     for(int row = 1; row<=x; row++){

         // space
         for(int col=1; col<=x-row; col++){
             System.out.print(" ");
         }
         // star
         for(int col=1; col<=x; col++){
             System.out.print("* ");
         }
         System.out.println();
     }
    }
    public static void main(String[] args){
        sub(5);
    }
}
