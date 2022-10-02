package LinkedList;

public class detectLoop {
    Node2 head;
    static class Node2{
        int data;
        Node2 next;
        Node2(int d){
            data = d;
            next = null;
        }
    }
    public void push(int new_data){
        Node2 new_node = new Node2(new_data);
        new_node.next = head;
        head = new_node;
    }
    public boolean detectCycle(Node2 head){
        if (head == null || head.next == null){
            return false;
        }
        Node2 fast = head, slow = head;
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        detectLoop dtl = new detectLoop();
        dtl.push(4);
        dtl.push(3);
        dtl.push(2);
        dtl.push(1);

        detectLoop dtl2 = new detectLoop();
        dtl2.push(20);
        dtl2.push(4);
        dtl2.push(15);
        dtl2.push(10);

        dtl2.head.next.next.next.next = dtl2.head;

        System.out.println("Without cycle");
        System.out.println("dtl has cycle " + dtl.detectCycle(dtl.head));
        System.out.println("With cycle");
        System.out.println("dtl2 has cycle " + dtl2.detectCycle(dtl2.head));

    }
}
