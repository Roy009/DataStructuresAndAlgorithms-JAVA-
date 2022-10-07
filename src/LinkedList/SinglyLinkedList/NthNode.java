package LinkedList.SinglyLinkedList;

public class NthNode {
    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.push(5);
        l.push(1);
        l.push(2);
        l.push(3);
        l.push(4);
        System.out.println("The last Element is " + l.getNthNode());
    }
}
class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

class linkedList{
    Node head;

    public void push(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    public int getNthNode(){
        Node temp = head;
        while (temp != null){
            if (temp.next == null){
                return temp.data;
            }
            temp = temp.next;
        }
        return 0;
    }
}