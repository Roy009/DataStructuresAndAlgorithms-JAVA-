package LinkedList.SinglyLinkedList;

public class PrintingTheMiddleElement {
    static class Node9{
        int data;
        Node9 next;
        Node9(int d){
            data = d;
            next = null;
        }
    }
    Node9 head;
    void push(int data){
        Node9 new_node = new Node9(data);
        new_node.next = head;
        head = new_node;
    }
    public int getLength(){
        Node9 temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }
    void printList(){
        Node9 temp = head;
        while (temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }
    void printMiddle(){
        Node9 temp = head;
        int len = getLength();
        int middle = len / 2;
        while (middle != 0){
            temp = temp.next;
            middle--;
        }
        System.out.println("The middle of the list is " + temp.data);
    }
    public static void main(String[] args) {
        PrintingTheMiddleElement pte = new PrintingTheMiddleElement();
        pte.push(6);
        pte.push(5);
        pte.push(4);
        pte.push(3);
        pte.push(2);
        pte.push(1);
        System.out.println("complete list");
        pte.printList();
        pte.printMiddle();
    }
}
