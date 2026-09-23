package String;
import java.util.Scanner;
public class InputOutputInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String = ");
        String str1 = sc.nextLine();
        System.out.println(str1);

        System.out.print("Enter the String = ");
        String str2 = sc.next();
        System.out.println(str2);
    }
}
