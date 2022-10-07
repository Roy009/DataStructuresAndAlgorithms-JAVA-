package LinkedList.SinglyLinkedList;


public class MergeLinkedList {
    static class Node4{
        int data;
        Node4 next;
        Node4(int d){
            data = d;
            next = null;
        }
    }
    Node4 head;
    public void addToTheLast(Node4 node)
    {
        if (head == null)
        {
            head = node;
        }
        else
        {
            Node4 temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
    public void printList()
    {
        Node4 tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
        System.out.println();
    }
     static Node4 sortedMerge(Node4 headA, Node4 headB){
        Node4 temp = new Node4(0);
        Node4 tail = temp;
        while (true){
            if (headA == null){
                tail.next = headB;
                break;
            }
            if (headB == null){
                tail.next = headA;
                break;
            }
            if (headA.data <= headB.data){
                tail.next = headA;
                headA = headA.next;
            }else{
                tail.next = headB;
                headB = headB.next;
            }
            tail = tail.next;
        }
        return temp.next;
    }
    public static void main(String[] args) {

        MergeLinkedList ml = new MergeLinkedList();
        MergeLinkedList ml1 = new MergeLinkedList();

        ml.addToTheLast(new Node4(1));
        ml.addToTheLast(new Node4(2));
        ml.addToTheLast(new Node4(3));
        ml.addToTheLast(new Node4(4));

        System.out.println("Linked list 1");
        ml.printList();

        ml1.addToTheLast(new Node4(5));
        ml1.addToTheLast(new Node4(6));
        ml1.addToTheLast(new Node4(7));
        ml1.addToTheLast(new Node4(8));

        System.out.println("Linked list 2");
        ml1.printList();

        ml.head = sortedMerge(ml.head, ml1.head);

        System.out.println("After merging the two linked list");
        ml.printList();
    }
}
