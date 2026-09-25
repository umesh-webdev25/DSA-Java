package collections.module2.Set_Interface;
import java.util.*;
public class ExampalOfHashSet{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        // add() → Add elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate → ignored
        System.out.println();

        // Print Set
        System.out.println(set);
        // contains() → Check if element exists
        System.out.println(set.contains(20));

        // size() → Number of elements
        System.out.println(set.size());

        // isEmpty() → Check if Set is empty
        System.out.println(set.isEmpty());

        // remove() → Remove element
        set.remove(30);
        System.out.println(set);

        // addAll() → Add elements from another Set
        Set<Integer> set2 = new HashSet<>();
        set2.add(40);
        set2.add(50);

        set.addAll(set2);
        System.out.println(set);

        // containsAll() → Check whether all elements exist
        System.out.println(set.containsAll(set2));

        // removeAll() → Remove elements that exist in set2
        set.removeAll(set2);
        System.out.println(set);

        // retainAll() → Keep only common elements
        Set<Integer> set3 = new HashSet<>();
        set3.add(10);
        set3.add(100);

        set.retainAll(set3);
        System.out.println(set);

        // clear() → Remove everything
        set.clear();
        System.out.println(set);
    }
}

