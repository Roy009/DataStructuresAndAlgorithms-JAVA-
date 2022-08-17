package Java_Collections;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("first");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        System.out.println(list);

        list.add(4,"five");

        System.out.println(list);
        list.remove("Second");
        list.removeFirst();
        list.removeLast();

        System.out.println(list);

    }
}
