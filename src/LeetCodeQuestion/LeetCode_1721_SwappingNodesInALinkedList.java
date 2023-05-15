package LeetCodeQuestion;


public class LeetCode_1721_SwappingNodesInALinkedList {
    Node head;
    static class Node {
        int data;
        Node next;

        Node(int d) {
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
    public static Node swapLinkedList(Node head, int k){
        if(head == null) return null;
        Node leftNode = head, rightNode = head;
        for (int i = 1; i < k; i++) {
            leftNode = leftNode.next;
        }
        Node current = leftNode;
        while (current.next != null){
            current = current.next;
            rightNode = rightNode.next;
        }
        int temp = leftNode.data;
        leftNode.data = rightNode.data;
        rightNode.data = temp;

        return head;
    }
    public static void main(String[] args) {
        LeetCode_1721_SwappingNodesInALinkedList list = new LeetCode_1721_SwappingNodesInALinkedList();
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        list.printList();
        swapLinkedList(list.head, 2);
        System.out.println("\nAfter Swapping");
        list.printList();
    }
}
