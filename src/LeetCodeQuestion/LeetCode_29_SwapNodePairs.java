package LeetCodeQuestion;

public class LeetCode_29_SwapNodePairs {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void push(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static Node swapNodePairs(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node pointer1 = head, pointer2 = head.next, pointer3 = null;
        pointer3 = swapNodePairs(pointer2.next);
        pointer1.next = pointer3;
        pointer2.next = pointer1;
        return pointer2;
    }
    public static void main(String[] args) {
        LeetCode_29_SwapNodePairs list = new LeetCode_29_SwapNodePairs();
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        list.printList();
        System.out.println("\nAfter swapping");
        swapNodePairs(list.head);
        list.printList();
    }
}
