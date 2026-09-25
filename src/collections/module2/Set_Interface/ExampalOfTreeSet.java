package collections.module2.Set_Interface;
import java.util.*;
public class ExampalOfTreeSet {
    public static void main(String[] args) {
        // Create TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // add() → Add elements
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(20); // Duplicate → ignored

        // TreeSet keeps elements sorted
        System.out.println(set);

        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());

        System.out.println("Lower than 30: " + set.lower(30));
        System.out.println("Higher than 30: " + set.higher(30));

        System.out.println("Floor of 30: " + set.floor(30));
        System.out.println("Ceiling of 30: " + set.ceiling(30));

        System.out.println("Poll First: " + set.pollFirst());
        System.out.println("Poll Last: " + set.pollLast());

        System.out.println("After polling: " + set);

        // contains() → Check element
        System.out.println(set.contains(20));

        // size() → Count elements
        System.out.println(set.size());

        // isEmpty() → Check empty
        System.out.println(set.isEmpty());

        // remove() → Remove element
        set.remove(10);
        System.out.println(set);

        // addAll()
        Set<Integer> set2 = new TreeSet<>();
        set2.add(40);
        set2.add(50);

        set.addAll(set2);
        System.out.println(set);

        // containsAll()
        System.out.println(set.containsAll(set2));

        // removeAll()
        set.removeAll(set2);
        System.out.println(set);

        // retainAll()
        Set<Integer> set3 = new TreeSet<>();
        set3.add(20);
        set3.add(100);

        set.retainAll(set3);
        System.out.println(set);



        // clear()
        set.clear();
        System.out.println(set);
    }
}
