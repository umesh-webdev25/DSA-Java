package Array;
import java.util.Scanner;
public class p1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 5 number = ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int l =arr.length;

        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        // for loop
//        for(int j=0; j<num; j++){
//            System.out.print(arr[j]);
//        }
        //for each
        System.out.print("Element of Arry [");
        for(int val: arr){
            System.out.print(val+" ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("lenght of arry "+l);
    }
}
