package patten;

public class p8 {
    static void sub(int x){
       for(int i=1; i<=x; i++){
           if(i==1 || i==2 || i==x){
               for(int j=1; j<=i; j++){
                   System.out.print("* ");
               }
           }else{
               System.out.print("* ");
               for(int j=1; j<=(i-2); j++){
                   System.out.print("  ");
               }
               System.out.print("* ");
           }
           System.out.println();
       }
    }
    public static void main(String[] args){
        sub(5);
    }
}
