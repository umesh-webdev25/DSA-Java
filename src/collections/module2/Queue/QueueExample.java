package collections.module2.Queue;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {

        // Create Queue using LinkedList
        Queue<Integer> q = new LinkedList<>();

        // offer() → Add element at the end
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        // Print Queue
        System.out.println(q);

        // peek() → Check first element without removing
        System.out.println(q.peek());

        // poll() → Remove first element
        System.out.println(q.poll());

        // Print Queue
        System.out.println(q);

        // add() → Add element at the end
        q.add(50);

        // element() → Check first element
        System.out.println(q.element());

        // remove() → Remove first element
        System.out.println(q.remove());

        // contains() → Check whether element exists
        System.out.println(q.contains(30));

        // size() → Count elements
        System.out.println(q.size());

        // isEmpty() → Check whether Queue is empty
        System.out.println(q.isEmpty());

        // Traverse Queue
        for (int num : q) {
            System.out.println(num);
        }

        // clear() → Remove all elements
        q.clear();

        System.out.println(q);
    }
}
