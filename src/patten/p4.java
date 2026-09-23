package patten;

public class p4 {
    static void sub(int x){
        for(int i=1; i<=x; i++){
          for(int j=1; j<=x-i+1; j++){
              System.out.print("* ");
          }
            System.out.println();
        }
    }
    public static void main(String[] args){
        sub(5);
    }
}
