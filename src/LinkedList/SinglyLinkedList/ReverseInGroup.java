package LinkedList.SinglyLinkedList;

public class ReverseInGroup {
    Node12 head;
    class Node12{
        int data;
        Node12 next;
        Node12(int d){
            data = d;
            next = null;
        }
    }
    Node12 reverse(Node12 head, int k){
        if (head == null)
            return null;
        Node12 current = head;
        Node12 next = null;
        Node12 prev = null;

        int count = 0;
        while (count < k && current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if (next != null)
            head.next = reverse(next, k);
        return prev;
    }
    void push(int d) {
        Node12 new_node = new Node12(d);
        new_node.next = head;
        head = new_node;
    }
    void printList(){
        Node12 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
    public static void main(String[] args) {
        ReverseInGroup rig = new ReverseInGroup();
        rig.push(5);
        rig.push(4);
        rig.push(3);
        rig.push(2);
        rig.push(1);
        System.out.println("Before reversing the list");
        rig.printList();
        System.out.println();
        System.out.println("After reversing the linked list");
        rig.head = rig.reverse(rig.head, 3);
        rig.printList();
    }
}
