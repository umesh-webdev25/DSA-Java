package method;
import java.util.Scanner;
public class table {
    static void printTable(int n){
        System.out.println("Here the tabel of number "+n);
        for(int i=1; i<=10; i++){
            int table = n*i;
            System.out.println(n+"x"+i+" = "+table);
        }
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number = ");
        int table = sc.nextInt();
        printTable(table);
    }
}
