package collections.module1.List;

import java.util.*;

public class VectorExampal {

    public static void main(String[] args) {

        // =====================================================
        // Create a Vector
        // Vector<Integer> means Vector stores Integer values
        // =====================================================

        Vector<Integer> v = new Vector<>();


        // =====================================================
        // 1. add()
        // Adds an element at the end of the Vector
        // =====================================================

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(30);   // Duplicate values are allowed
        v.add(50);

        // Print the complete Vector
        System.out.println("Vector: " + v);


        // =====================================================
        // 2. size()
        // Returns the number of elements in the Vector
        // =====================================================

        System.out.println("Size: " + v.size());


        // =====================================================
        // 3. get(index)
        // Returns the element at the specified index
        // =====================================================

        System.out.println("Element at index 2: " + v.get(2));


        // =====================================================
        // 4. contains()
        // Checks whether an element exists
        // Returns true or false
        // =====================================================

        System.out.println("Contains 30: " + v.contains(30));


        // =====================================================
        // 5. indexOf()
        // Returns the index of the first occurrence
        // =====================================================

        System.out.println("First index of 30: " + v.indexOf(30));


        // =====================================================
        // 6. lastIndexOf()
        // Returns the index of the last occurrence
        // =====================================================

        System.out.println("Last index of 30: " + v.lastIndexOf(30));


        // =====================================================
        // 7. set(index, element)
        // Replaces the element at the specified index
        // =====================================================

        v.set(1, 200);

        System.out.println("After set(): " + v);


        // =====================================================
        // 8. add(index, element)
        // Adds an element at a specific index
        // Existing elements are shifted to the right
        // =====================================================

        v.add(2, 100);

        System.out.println("After add(index, element): " + v);


        // =====================================================
        // 9. remove(index)
        // Removes the element at the specified index
        // =====================================================

        v.remove(2);

        System.out.println("After remove(index): " + v);


        // =====================================================
        // 10. remove(Object)
        // Removes the specified value
        // =====================================================

        v.remove(Integer.valueOf(30));

        System.out.println("After removing value 30: " + v);


        // =====================================================
        // 11. isEmpty()
        // Checks whether the Vector is empty
        // =====================================================

        System.out.println("Is Vector empty: " + v.isEmpty());


        // =====================================================
        // 12. addAll()
        // Adds all elements from another collection
        // =====================================================

        Vector<Integer> v2 = new Vector<>();

        v2.add(60);
        v2.add(70);

        v.addAll(v2);

        System.out.println("After addAll(): " + v);


        // =====================================================
        // 13. removeAll()
        // Removes all elements that are also present
        // in the specified collection
        // =====================================================

        v.removeAll(v2);

        System.out.println("After removeAll(): " + v);


        // =====================================================
        // 14. clear()
        // Removes all elements from the Vector
        // =====================================================

        // v.clear();

        // System.out.println("After clear(): " + v);


        // =====================================================
        // 15. for loop
        // Traverse the Vector using index
        // =====================================================

        System.out.println("Vector elements:");

        for (int i = 0; i < v.size(); i++) {

            // get(i) gets the element at index i
            System.out.println(v.get(i));
        }


        // =====================================================
        // 16. firstElement()
        // Returns the first element
        // =====================================================

        System.out.println(
                "First element: " + v.firstElement()
        );


        // =====================================================
        // 17. lastElement()
        // Returns the last element
        // =====================================================

        System.out.println(
                "Last element: " + v.lastElement()
        );
    }
}