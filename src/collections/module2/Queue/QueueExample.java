package collections.module2.Queue;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.contains(20));
        System.out.println(list.size());
        for(int num : list){
            System.out.println(num);
        }

        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        List<Integer> list2 = new LinkedList<>();
        list2.addAll(list);
        System.out.println(list2);

        list2.add(50);
        list2.add(60);
        list2.add(70);
        list2.add(80);
        list2.addFirst(900);

        list2.removeAll(list);
        System.out.println(list2);
        list2.addFirst(5);
        list2.addLast(90);
        System.out.println(list2);
        list2.removeFirst();
        list2.removeLast();
        System.out.println(list2);
        System.out.println(list.peek());
        list2.clear();
        System.out.println(list2);
    }
}
