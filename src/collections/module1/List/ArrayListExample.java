package collections.module1.List;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {

        // Create an ArrayList that stores Integer values
        ArrayList<Integer> list = new ArrayList<>();

        // =====================================================
        // 1. add()
        // Adds an element to the ArrayList
        // =====================================================

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("ArrayList: " + list);


        // =====================================================
        // 2. remove(index)
        // Removes the element at the specified index
        // Index starts from 0
        // =====================================================

        list.remove(2);

        System.out.println(
                "After removing element at index 2: " + list
        );


        // =====================================================
        // 3. contains()
        // Checks whether the specified element exists
        // Returns true or false
        // =====================================================

        System.out.println(
                "Contains element 3: " + list.contains(3)
        );


        // =====================================================
        // 4. size()
        // Returns the number of elements in the ArrayList
        // =====================================================

        System.out.println(
                "Size of ArrayList: " + list.size()
        );


        // =====================================================
        // 5. get(index)
        // Returns the element at the specified index
        // =====================================================

        System.out.println(
                "Element at index 1: " + list.get(1)
        );


        // =====================================================
        // Create another ArrayList
        // =====================================================

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(5);
        list2.add(6);


        // =====================================================
        // 6. addAll()
        // Adds all elements of list2 into list
        // =====================================================

        list.addAll(list2);

        System.out.println(
                "After adding all elements from list2: " + list
        );

        System.out.println(
                "list2: " + list2
        );


        // =====================================================
        // 7. removeAll()
        // Removes all elements from list that are
        // also present in list2
        // =====================================================

        list.removeAll(list2);

        System.out.println(
                "After removing all elements from list2: " + list
        );


        // =====================================================
        // 8. iterator()
        // Used to iterate/traverse through the ArrayList
        // one element at a time
        // =====================================================

        Iterator<Integer> it = list.iterator();

        System.out.print("Iterating through the list: ");

        while (it.hasNext()) {

            // next() returns the next element
            System.out.print(it.next() + " ");
        }

        System.out.println();


        // =====================================================
        // 9. add(index, element)
        // Adds an element at a specific index
        // Existing elements are shifted to the right
        // =====================================================

        list.add(0, 100);

        System.out.println(
                "After adding 100 at index 0: " + list
        );


        // =====================================================
        // 10. for loop + get()
        // Used to access ArrayList elements using index
        // =====================================================

        System.out.println("Using for loop:");

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i)+" ");

        }


        // =====================================================
        // 11. set(index, element)
        // Replaces the element at the specified index
        // =====================================================

        list.set(3, 200);

        System.out.println(
                "After setting index 3 to 200: " + list
        );


        // =====================================================
        // 12. clear()
        // Removes ALL elements from the ArrayList
        // =====================================================

        // list.clear();

        // System.out.println(
        //         "After clearing the list: " + list
        // );


        // =====================================================
        // 13. toArray()
        // Converts ArrayList into an Object array
        // =====================================================

        // Sort the list in ascending order
        // Smallest → Largest
        Collections.sort(list);

        System.out.println(
                "After sorting the list: " + list
        );


      // Sort the list in descending order
       // Largest → Smallest
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(
                "After sorting the list in descending order: " + list
        );

        Object[] arr = list.toArray();

        System.out.println(
                "List to    Array: " + Arrays.toString(arr)
        );
    }
}
