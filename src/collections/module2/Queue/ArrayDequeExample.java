package collections.module2.Queue;

import java.util.*;

public class ArrayDequeExample {

    public static void main(String[] args) {

        // Create Queue using ArrayDeque
        Queue<Integer> list= new ArrayDeque<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.offer(60);

        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.contains(20));
        System.out.println(list.size());
        for(int num : list){
            System.out.println(num);
        }

        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        Queue<Integer> list2 = new ArrayDeque<>();
        list2.addAll(list);
        System.out.println(list2);

        list2.add(50);
        list2.add(60);
        list2.add(70);
        list2.add(80);


        list2.removeAll(list);
        System.out.println(list2);

        System.out.println(list2);

        System.out.println(list2);
        System.out.println(list2.peek());
        System.out.println(list2.poll());
        list2.clear();
        System.out.println(list2);
    }
}