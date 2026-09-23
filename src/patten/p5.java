package patten;

public class p5 {
    static void sub(int x){
       for(int i=1; i<=x; i++){
           //space
           for(int j=1; j<=x-i; j++){
               System.out.print(" ");
           }
           //star
           for(int j=1; j<=2*i-1; j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
    public static void main(String[] args){
        sub(5);
    }
}
