package LinkedList.SinglyLinkedList;

import java.util.Objects;

public class RemoveDuplicate {
    Node11 head;
    static class Node11{
        int data;
        Node11 next;
        Node11(int d){
            data = d;
            next = null;
        }
    }
    void push(int d){
        Node11 new_node = new Node11(d);
        new_node.next = head;
        head = new_node;
    }
    void printList(){
        Node11 temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }
    void removeDuplicate(){

        Node11 temp = head, prev = head;

        while (temp != null){
            if (temp.data != prev.data){
                prev.next = temp;
                prev = temp;
            }
            temp = temp.next;
        }
        if (prev != temp)
            prev.next = null;
    }
    public static void main(String[] args) {
        RemoveDuplicate rd = new RemoveDuplicate();
        rd.push(20);
        rd.push(13);
        rd.push(13);
        rd.push(11);
        rd.push(11);
        rd.push(11);
        rd.printList();
        System.out.println();
        System.out.println("after removing the duplicate element");
        rd.removeDuplicate();
        rd.printList();

    }
}
