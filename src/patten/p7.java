package patten;
public class p7 {
    static void sub(int x){
        for(int i=1; i<=x; i++){
            for(int j=1; j<=6; j++){
                if(i==1 || i==x){
                    System.out.print("* ");
                }else {
                    if(j==1 || j==6) {
                        System.out.print("* ");
                    }  else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        sub(4);
    }
}
