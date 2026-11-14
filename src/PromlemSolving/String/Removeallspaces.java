package PromlemSolving.String;

public class Removeallspaces {
    void main(){
        String s = "hello world java";
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                ans = ans + s.charAt(i);
            }
        }

        System.out.println(ans);
    }
}
