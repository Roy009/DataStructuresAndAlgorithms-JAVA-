package LinkedList;

class LinkedList_1 {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){ data = d; next = null; }
    }
    // Insert a Node at the front
    public void push(int data){
        // creating the new node with the give data in the parameter
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    // Insert a new Node after the given previous node
    public void insertAfter(Node prevNode, int data){
        // EdgeCase - Checking the previous node is null or not
        if (prevNode == null){
            System.out.println("The previous Node is null");
            return;
        }
        // Creating the new Node
        Node newNode = new Node(data);
        // changing the next pointer of newNode to prevNode's next
        newNode.next = prevNode.next;
        // And prevNode pointer to newNode
        prevNode.next = newNode;
    }
    // Append a new node at the end
    public void append(int data){
        // Creating the new Node
        Node newNode = new Node(data);
        // EdgeCase - If the Linked List is empty, then make the new node as head
        if (head == null){
            head = new Node(data);
            return;
        }
        newNode.next = null;
        // otherwise traverse till the last node
        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        // Change the next of last node
        last.next = newNode;
        return;
    }
    // Deleting the node
    public void deleteNode(int key){
        Node temp = head, prev = null;
        if (temp != null && temp.data == key){
            head = temp.next;
            return;
        }
        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        if (temp == null){
            return;
        }
        prev.next = temp.next;
    }

    // Printing the LinkedList
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class Linkedllist {
    public static void main(String[] args) {
        LinkedList_1 list = new LinkedList_1();
        list.append(4);
        list.append(3);
        list.append(2);
        list.append(1);
        list.push(5);
        list.printList();
        System.out.println(list.head.data);
    }
}
