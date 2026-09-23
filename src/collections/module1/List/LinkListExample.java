package collections.module1.List;
import java.util.*;
public class LinkListExample {
    public static void main(String[] args) {

        // Create a List reference using LinkedList object
        // Integer means this list can store only Integer values
        List<Integer> list = new LinkedList<>();


        // =====================================================
        // add()
        // Adds an element to the end of the list
        // =====================================================

        list.add(1);
        list.add(2);
        list.add(3);

        // Print the complete list
        System.out.println(list);


        // =====================================================
        // for loop + size() + get()
        // Traverse the LinkedList using index
        // =====================================================

        for (int i = 0; i < list.size(); i++) {

            // get(i) returns the element at index i
            System.out.println(list.get(i));
        }


        // =====================================================
        // contains()
        // Checks whether the specified element exists
        // Returns true or false
        // =====================================================

        System.out.println(list.contains(3));


        // =====================================================
        // indexOf()
        // Returns the index of the first occurrence
        // of the specified element
        // =====================================================

        System.out.println(list.indexOf(3));


        // =====================================================
        // isEmpty()
        // Checks whether the list contains no elements
        // Returns true or false
        // =====================================================

        System.out.println(list.isEmpty());


        // =====================================================
        // set(index, element)
        // Replaces the element at the specified index
        // =====================================================

        System.out.println(list.set(2, 100));

        // Print the updated list
        System.out.println(list);


        // =====================================================
        // listIterator()
        // Creates a ListIterator for traversing the list
        // =====================================================

        ListIterator<Integer> listIterator = list.listIterator();


        // hasNext()
        // Checks whether another element exists
        // next()
        // Returns the next element
        // =====================================================

        while (listIterator.hasNext()) {

            System.out.println(listIterator.next());
        }


        // =====================================================
        // reversed()
        // Returns a reversed view of the list
        // Original list is not directly modified
        // =====================================================

        System.out.println(list.reversed());


        // =====================================================
        // Create another LinkedList
        // =====================================================

        LinkedList<Integer> list2 = new LinkedList<>();


        // =====================================================
        // addAll()
        // Adds all elements of list into list2
        // addAll() returns true if the list changes
        // =====================================================

        System.out.println(list2.addAll(list));

        // Print list2
        System.out.println(list2);


        // =====================================================
        // Collections.sort()
        // Sorts the list in ascending order
        // Smallest → Largest
        // =====================================================

        Collections.sort(list2);


        // =====================================================
        // Collections.reverse()
        // Reverses the order of elements
        // =====================================================

        Collections.reverse(list2);

        // Print list2 after sorting and reversing
        System.out.println(list2);


        // =====================================================
        // add()
        // Adds elements to the end of list2
        // =====================================================

        list2.add(200);
        list2.add(300);
        list2.add(100);

        System.out.println(list2);


        // =====================================================
        // lastIndexOf()
        // Returns the index of the last occurrence
        // of the specified element
        // =====================================================

        System.out.println(list2.lastIndexOf(100));


        // =====================================================
        // addLast()
        // Adds an element at the end of LinkedList
        // =====================================================

        list2.addLast(400);


        // =====================================================
        // addFirst()
        // Adds an element at the beginning of LinkedList
        // =====================================================

        list2.addFirst(500);


        // =====================================================
        // addLast()
        // Adds another element at the end
        // =====================================================

        list2.addLast(600);

        System.out.println(list2);


        // =====================================================
        // removeFirst()
        // Removes the first element
        // =====================================================

        list2.removeFirst();


        // =====================================================
        // removeLast()
        // Removes the last element
        // =====================================================

        list2.removeLast();

        System.out.println(list2);


        // =====================================================
        // peek()
        // Returns the first element without removing it
        // Returns null if the list is empty
        // =====================================================

        System.out.println(list2.peek());


        // =====================================================
        // poll()
        // Returns and removes the first element
        // Returns null if the list is empty
        // =====================================================

        System.out.println(list2.poll());

    }
}
