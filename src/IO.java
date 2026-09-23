import java.util.Scanner;
public class IO {
    public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter name -");
        String name = sc.next();
        System.out.println("Enter age -");
        int age = sc.nextInt();
        System.out.println("Name - "+name);
        System.out.println("Age - "+age);
    }
}
