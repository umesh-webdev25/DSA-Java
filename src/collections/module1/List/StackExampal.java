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

        // pop() → Remove top element
        s.pop();

        // peek() → Check top element
        System.out.println(s.peek());

        // isEmpty() → Check whether Stack is empty
        System.out.println(s.isEmpty());

        // size() → Get number of elements
        System.out.println(s.size());

        // search() → Find position from top
        System.out.println(s.search(30));

        // contains() → Check if element exists
        System.out.println(s.contains(30));

        // get() → Get element by index
        System.out.println(s.get(2));

        // set() → Replace element at index
        s.set(2, 100);
        System.out.println(s);

        // remove() → Remove element by index
        s.remove(2);
        System.out.println(s);

        // clear() → Remove all elements
        s.clear();
        System.out.println(s);
    }
}