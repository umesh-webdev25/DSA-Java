package collections.module2.Dqueue;

import java.util.*;

public class ArrayDequeExample {

    public static void main(String[] args) {

        // Create Deque using ArrayDeque
        Deque<Integer> q = new ArrayDeque<>();

        // Add
        q.addFirst(10);
        q.addLast(20);

        q.offerFirst(5);
        q.offerLast(30);

        System.out.println(q);

        // Check first and last
        System.out.println(q.getFirst());
        System.out.println(q.getLast());

        System.out.println(q.peekFirst());
        System.out.println(q.peekLast());

        // Remove
        System.out.println(q.removeFirst());
        System.out.println(q.removeLast());

        System.out.println(q.pollFirst());
        System.out.println(q.pollLast());

        // Queue-style methods
        q.add(40);
        q.offer(50);

        System.out.println(q.peek());
        System.out.println(q.element());

        System.out.println(q.poll());
        System.out.println(q.remove());

        // Stack-style methods
        q.push(60);
        System.out.println(q.pop());

        // Other methods
        System.out.println(q.contains(20));
        System.out.println(q.size());
        System.out.println(q.isEmpty());

        // Traversal
        for (int num : q) {
            System.out.println(num);
        }

        // Remove everything
        q.clear();

        System.out.println(q);
    }
}