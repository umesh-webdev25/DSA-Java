package String;

public class stringToCharArray {
    public static void main(String[] args){
        String name = "Umesh";
        char[] crr = name.toCharArray();
        for(char ch : crr){
            System.out.println(" "+ch);
        }
    }
}
