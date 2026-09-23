package collections.module2.Queue;

import java.util.*;

public class PriorityQueueExample {

    public static void main(String[] args) {

        // Create PriorityQueue
        Queue<Integer> q = new PriorityQueue<>();

        // offer() → Add element
        q.offer(30);
        q.offer(10);
        q.offer(20);
        q.offer(40);

        // add() → Add element
        q.add(50);

        // Print Queue
        System.out.println(q);

        // peek() → Check highest-priority element
        System.out.println(q.peek());

        // element() → Check highest-priority element
        System.out.println(q.element());

        // poll() → Remove highest-priority element
        System.out.println(q.poll());

        // remove() → Remove highest-priority element
        System.out.println(q.remove());

        // contains() → Check whether element exists
        System.out.println(q.contains(30));

        // size() → Number of elements
        System.out.println(q.size());

        // isEmpty() → Check whether Queue is empty
        System.out.println(q.isEmpty());

        // for-each → Traverse PriorityQueue
        for (int num : q) {
            System.out.println(num);
        }

        // clear() → Remove all elements
        q.clear();

        // Print after clear
        System.out.println(q);
    }
}