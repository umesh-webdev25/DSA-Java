package collections.module2.Set_Interface;
import java.util.*;
public class ExampalOfTreeSet {
    public static void main(String[] args) {
        // Create TreeSet
        Set<Integer> set = new TreeSet<>();

        // add() → Add elements
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(20); // Duplicate → ignored

        // TreeSet keeps elements sorted
        System.out.println(set);

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
