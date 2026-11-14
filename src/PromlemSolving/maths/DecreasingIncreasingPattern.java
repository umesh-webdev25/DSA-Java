package PromlemSolving.maths;
import java.util.*;
public class DecreasingIncreasingPattern {
    public ArrayList<Integer> pattern(int n){

        ArrayList<Integer> list = new ArrayList<>();
        if(n <= 0){
            list.add(n);
            return list;
        }

        int temp = n;

        while (temp > 0){
            list.add(temp);
            temp -= 5;
        }

        while(temp <= n){
            list.add(temp);
            temp+=5;
        }
        return list;
    }
    void main(){
        int n = -10;
        ArrayList<Integer> list = pattern(n);
        System.out.println(list);
    }
}
