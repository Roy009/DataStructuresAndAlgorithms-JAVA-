package LinkedList.DoublyLinkedList;

public class ReverseDoublyLinkedList {

    static Node head;

    // creating the Node class

    static class Node {
        int data;
        Node next,prev;

        Node(int d){
            data = d;
            next = prev = null;
        }
    }
    void reverse() {
        Node temp = null;
        Node current = head;

        while (current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null)
            head = temp.prev;
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        new_node.prev = null;
        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
    }

    void printList() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Reverse printing");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseDoublyLinkedList rdll = new ReverseDoublyLinkedList();

        rdll.push(4);
        rdll.push(3);
        rdll.push(2);
        rdll.push(1);
        rdll.printList();
        rdll.reverse();
        System.out.println("After reversing the Doubly linked list");
        rdll.printList();
    }
}
