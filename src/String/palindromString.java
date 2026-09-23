package String;
public class palindromString {
    static void checkPalinDrom(String str){
       StringBuilder st = new StringBuilder(str);
       st.reverse();
       if(str.equals(st.toString())){
           System.out.println(str+" Is palindrom String");
       }else{
           System.out.println(str+" Is Not String");
       }
    }
    public static void main(String[] args){
        String str = "NAMAN";
        checkPalinDrom(str);
    }
}
