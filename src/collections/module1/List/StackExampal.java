package collections.module1.List;

import java.util.*;

public class StackExampal {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        // push() → Add element to top
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);


        s.pop();
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        System.out.println(s.search(30));
        System.out.println(s.contains(30));
        System.out.println(s.get(2));
        s.set(2, 100);
        System.out.println(s);
        s.remove(2);
        System.out.println(s);

        for(int num : s){
            System.out.println(num);
        }

        s.clear();
        System.out.println(s);
    }
}