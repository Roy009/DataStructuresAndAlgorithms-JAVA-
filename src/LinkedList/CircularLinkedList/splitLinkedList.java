package LinkedList.CircularLinkedList;

public class splitLinkedList {
    static Node2 head, head1, head2;

    static class Node2{
        int data;
        Node2 next, prev;
        Node2(int d){
            data = d;
            next = prev = null;
        }
    }
    void splitList(){
        Node2 slow = head;
        Node2 fast = head;

        if (head == null){
            return;
        }
        while (fast.next != head && fast.next.next != head){
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast.next.next == head){
            fast = fast.next;
        }
        head1 = head;

        if (head.next != head){
            head2 = slow.next;
        }
        fast.next = slow.next;
        slow.next = head;
    }
    void  printList(Node2 node){
        Node2 temp = node;
        if (node != null){
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }while (temp != node);
        }
    }
    public static void main(String[] args) {
        splitLinkedList sl = new splitLinkedList();
        sl.head = new Node2(1);
        sl.head.next = new Node2(2);
        sl.head.next.next = new Node2(3);
        sl.head.next.next.next = new Node2(4);
        sl.head.next.next.next.next = sl.head;
        System.out.println("Before splitting");
        sl.printList(head);
        System.out.println();
        System.out.println("After splitting");
        sl.splitList();
        System.out.println("List 1");
        sl.printList(head1);
        System.out.println();
        System.out.println("List 2");
        sl.printList(head2);
    }
}
