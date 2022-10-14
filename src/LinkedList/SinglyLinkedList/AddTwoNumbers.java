package LinkedList.SinglyLinkedList;

public class AddTwoNumbers {
    static Node7 head1, head2;
    static class Node7{
        int data;
        Node7 next;
        Node7(int d){
            data = d;
            next = null;
        }
    }
    void adTwoLists(Node7 first, Node7 second){
        Node7 start1 = new Node7(0);
        start1.next = first;
        Node7 start2 = new Node7(0);
        start2.next = second;

        addPrecedingZeros(start1, start2);
        Node7 result = new Node7(0);
        if (sumTwoNodes(start1.next, start2.next,result) == 1){
            Node7 node = new Node7(1);
            node.next = result.next;
            result.next = node;
        }
        printList(result.next);
    }
    private int sumTwoNodes(Node7 first, Node7 second, Node7 result) {
        if (first == null) {
            return 0;
        }
        int number = first.data + second.data + sumTwoNodes(first.next, second.next, result);
        Node7 node = new Node7(number % 10);
        node.next = result.next;
        result.next = node;
        return number / 10;
    }
    private void addPrecedingZeros(Node7 start1, Node7 start2) {
        Node7 next1 = start1.next;
        Node7 next2 = start2.next;
        while (next1 != null && next2 != null) {
            next1 = next1.next;
            next2 = next2.next;
        }
        if (next1 == null && next2 != null) {
            while (next2 != null) {
                Node7 node = new Node7(0);
                node.next = start1.next;
                start1.next = node;
                next2 = next2.next;
            }
        } else if (next2 == null && next1 != null) {
            while (next1 != null) {
                Node7 node = new Node7(0);
                node.next = start2.next;
                start2.next = node;
                next1 = next1.next;
            }
        }
    }
    void printList(Node7 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        AddTwoNumbers list = new AddTwoNumbers();
        list.head1 = new Node7(7);
        list.head1.next = new Node7(5);
        list.head1.next.next = new Node7(9);
        list.head1.next.next.next = new Node7(4);
        list.head1.next.next.next.next = new Node7(6);
        System.out.print("First list is ");
        list.printList(head1);

        list.head2 = new Node7(8);
        list.head2.next = new Node7(4);
        System.out.print("Second list is ");
        list.printList(head2);

        System.out.println("Resultant list is ");
        list.adTwoLists(head1,head2);

    }
}