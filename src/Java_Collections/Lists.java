package Java_Collections;
import java.util.*;

public class Lists {
    public static void main(String[] args) {
        // Creating a list object implemented by ArrayList class
        List<Integer> l1 = new ArrayList<>();
        // Adding Element in the List (index, element)
        l1.add(0,1);
        l1.add(1,2);
        l1.add(2,3);
        System.out.println(l1); // [1, 2, 3]

        List<Integer> l2 = new ArrayList<>();
        l2.add(4);
        l2.add(5);
        l2.add(6);
        // Adding list to another list after specified index
        l1.addAll(3, l2);
        System.out.println(l1); // [ 1, 2, 3, 4, 5, 6 ]
        // removing element form the list
        l1.remove(3); // 4
        // Retrieving element form the index number
        System.out.println(l1.get(4)); // 6
        // Changing / Setting element on specified index to specified element (index, element)
        l1.set(3, 4); // 5 -> 4
        System.out.println(l1); // [ 1, 2, 3, 4, 6]
        System.out.println(l1.size()); // 5
        // isEmpty() - it checks that the list is empty or not
        System.out.println(l1.isEmpty()); // false
        // contains() - it checks that the list have the specified element or not
        System.out.println(l1.contains(3)); // true

        // Iterating list elements

        // for loop
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();
        // for each
        for (int element : l1){
            System.out.print(element + " ");
        }
    }
}
