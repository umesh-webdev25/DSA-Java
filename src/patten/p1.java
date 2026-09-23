package patten;
public class p1 {
    static void sub(int x){
        for(int i=0; i<x; i++){
            for(int j=0; j<x; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        sub(10);
    }

}
