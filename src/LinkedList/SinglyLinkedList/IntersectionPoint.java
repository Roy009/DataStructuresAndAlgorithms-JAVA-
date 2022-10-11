package LinkedList.SinglyLinkedList;

class Node6{
    int data;
    Node6 next = null;
    Node6(int d){
        this.data = d;
        this.next = null;
    }
}
public class IntersectionPoint {
    Node6 head;
    public Node6 getIntersect(Node6 headA, Node6 headB){
        while (headB != null){
            Node6 temp = headA;
            while (temp != null){
                if (temp == headB){
                    return headB;
                }
                temp = temp.next;
            }
            headB = headB.next;
        }
        return null;
    }
    public void push(int data){
        // creating the new node with the give data in the parameter
        Node6 new_node = new Node6(data);
        new_node.next = head;
        head = new_node;
    }
    public static void main(String[] args) {
       Node6 head1, head2;

       head1 = new Node6(10);
       head2 = new Node6(3);

       Node6 newNode = new Node6(6);
       head2.next = newNode;

       newNode = new Node6(9);
       head2.next.next = newNode;


        newNode = new Node6(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node6(30);
        head1.next.next = newNode;

        head1.next.next.next = null;
        IntersectionPoint ip = new IntersectionPoint();
        Node6 I_point = ip.getIntersect(head1,head2);

        if (I_point == null)
            System.out.println(" No Intersection point");
        else
            System.out.println("intersection point : " + I_point.data);
    }
}
