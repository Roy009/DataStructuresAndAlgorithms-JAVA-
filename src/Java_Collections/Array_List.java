package Java_Collections;
import java.util.*;
public class Array_List {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        for (int i = 0; i <= n; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.contains(4));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.clone());
    }
}
