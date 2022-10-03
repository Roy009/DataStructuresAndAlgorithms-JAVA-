package LinkedList;

public class ReverseLinkedList {
    static Node3 head;
    static class Node3{
        int data;
        Node3 next;
        Node3(int d){
            data = d;
            next = null;
        }
    }
    Node3 reverseLinkedList(Node3 node){
        Node3 prev = null;
        Node3 current = node;
        Node3 next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    public void push(int new_data){
        Node3 new_node = new Node3(new_data);
        new_node.next = head;
        head = new_node;
    }
    void printList(Node3 node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        ReverseLinkedList rl = new ReverseLinkedList();
        rl.push(1);
        rl.push(2);
        rl.push(3);
        rl.push(4);
        rl.push(5);
        System.out.println("Before reverse");
        rl.printList(head);
        System.out.println();
        System.out.println("After reverse");
        head = rl.reverseLinkedList(head);
        rl.printList(head);

    }
}
