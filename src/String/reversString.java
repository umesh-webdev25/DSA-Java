package String;

public class reversString {
    static void reversString(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }
    public static void main(String[] args){
        String str = "umesh";
        reversString(str);
    }
}
