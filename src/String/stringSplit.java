package String;

public class stringSplit {
    public static void main(String[] args){
        String name = "my name is umesh gayakwad";
        String arr[] = name.split(" ");  // space and coma both
        for(String str : arr){
            System.out.println(str);
        }

    }
}
