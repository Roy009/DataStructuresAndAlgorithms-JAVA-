package LinkedList.DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    public class Node {
        int data;
        Node next;
        Node prev;
        Node(int d) {
            data = d;
        }
        Node(int d, Node next, Node prev) {
            this.data = d;
            this.next = next;
            this.prev = prev;
        }
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        new_node.prev = null;
        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
    }

    void append(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;

        if (head == null){
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    void printList() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Reverse printing");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
        System.out.println();
    }
    Node find(int val){
        Node node = head;
        while (node != null){
            if (node.data == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    void insert(int after, int val){
        Node p = find(after);

        if (p == null){
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }
    void deleteNode(Node node){
        if(head == null || node == null)
            return;
        if (head == node)
            head = node.next;
        if (node.next != null)
            node.next.prev = node.prev;
        if (node.prev != null)
            node.prev.next = node.next;
        return;
    }
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.push(5);
        dl.push(4);
        dl.push(3);
        dl.push(2);
        dl.push(1);
        dl.printList();
        dl.append(6);
        System.out.println();
        dl.printList();
        System.out.println();
        System.out.println(dl.find(4));
        System.out.println(dl.find(7));
        dl.insert(4,8);
        System.out.println();
        dl.printList();
        dl.deleteNode(dl.head);
        dl.deleteNode(dl.head.next);
        dl.printList();
    }
}
