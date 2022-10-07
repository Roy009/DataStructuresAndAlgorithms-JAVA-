package LinkedList.SinglyLinkedList;

public class DetectAndRemoveLoop {
    static Node5 head;
    static class Node5 {
        int data;
        Node5 next;
        Node5(int d){
            data = d;
            next = null;
        }
    }

    int detectAndRemoveLoop(Node5 node){
        Node5 slow = node, fast = node;
        while (slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                removeLoop(slow, node);
                return 1;
            }
        }
        return 0;
    }
    void removeLoop(Node5 loop, Node5 head){
        Node5 ptr1 = loop;
        Node5 ptr2 = loop;

        int k = 1, i;
        while (ptr1.next != ptr2) {
            ptr1 = ptr1.next;
            k++;
        }

        ptr1 = head;

        ptr2 = head;
        for (i = 0; i < k; i++) {
            ptr2 = ptr2.next;
        }

        while (ptr2 != ptr1) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        while (ptr2.next != ptr1){
            ptr2 = ptr2.next;
        }

        ptr2.next = null;
    }
    public void printList()
    {
        Node5 tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DetectAndRemoveLoop dtlr = new DetectAndRemoveLoop();
        dtlr.head = new Node5(1);
        dtlr.head.next = new Node5(2);
        dtlr.head.next.next = new Node5(3);
        dtlr.head.next.next.next = new Node5(4);
        dtlr.head.next.next.next.next = new Node5(5);

        // creating loop
        head.next.next.next.next.next = head.next.next;
        System.out.println("if it returns 0 loop is not there and if it returns 1 means loop was there " + "the answer is " + dtlr.detectAndRemoveLoop(head));
        System.out.println("Linked list after removing the loop : ");
        dtlr.printList();

    }
}
