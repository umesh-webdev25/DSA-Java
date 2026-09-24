package collections.module2.Set_Interface;
import java.util.*;
public class ExampalOfLinkedHashSet {
    public static void main(String[] args) {
        // Create LinkedHashSet
        Set<Integer> set = new LinkedHashSet<>();

        // add() → Add elements
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(20); // Duplicate → ignored

        // Maintains insertion order
        System.out.println(set);

        // contains() → Check element
        System.out.println(set.contains(10));

        // size() → Count elements
        System.out.println(set.size());

        // isEmpty() → Check empty
        System.out.println(set.isEmpty());

        // remove() → Remove element
        set.remove(30);
        System.out.println(set);

        // addAll()
        Set<Integer> set2 = new LinkedHashSet<>();
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
        Set<Integer> set3 = new LinkedHashSet<>();
        set3.add(10);
        set3.add(100);

        set.retainAll(set3);
        System.out.println(set);

        // clear()
        set.clear();
        System.out.println(set);
    }
}
