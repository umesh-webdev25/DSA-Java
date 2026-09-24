package collections.module1.List;
import java.util.*;
public class LinkListExample {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.addFirst(23);
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.contains(20));
        System.out.println(list.indexOf(20));
        System.out.println(list.get(1));
        System.out.println(list.size());
        for(int num : list){
            System.out.println(num);
        }

       list.remove(4);
        System.out.println(list);

        list.set(1,12);
        System.out.println(list);
        System.out.println(list.lastIndexOf(40));
        System.out.println();

        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        System.out.println(list.reversed());


        List<Integer> list2 = new LinkedList<>();
        list2.addAll(list);
        System.out.println(list2);

        list2.add(50);
        list2.add(60);
        list2.add(70);
        list2.add(80);

        list2.removeAll(list);
        System.out.println(list2);
        list2.addFirst(5);
        list2.addLast(90);
        System.out.println(list2);

        list2.removeFirst();
        list2.removeLast();
        System.out.println(list2);
        list2.clear();
        System.out.println(list2);

    }
}
