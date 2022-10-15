package LinkedList.SinglyLinkedList;

public class RotateLinkedList {
    Node8 head;
    class Node8{
        int data;
        Node8 next;
        Node8(int d){
            data = d;
            next = null;
        }
    }
    public void push(int new_data){
        Node8 new_node = new Node8(new_data);
        new_node.next = head;
        head = new_node;
    }
    void printList(Node8 node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    void rotate(int k)
    {
        if (k == 0)
            return;

        Node8 current = head;

        int count = 1;

        while (count < k && current != null) {
            current = current.next;
            count++;
        }
        if (current == null)
            return;
        Node8 kthNode = current;

        while (current.next != null)
            current = current.next;

        current.next = head;
        head = kthNode.next;
        kthNode.next = null;
    }
    public static void main(String[] args) {
        RotateLinkedList rll = new RotateLinkedList();
        for (int i = 60; i >= 10; i -= 10)
            rll.push(i);

        System.out.println("Before rotation");
        rll.printList(rll.head);
        rll.rotate(4);
        System.out.println();
        System.out.println("After rotation");
        rll.printList(rll.head);
    }
}
