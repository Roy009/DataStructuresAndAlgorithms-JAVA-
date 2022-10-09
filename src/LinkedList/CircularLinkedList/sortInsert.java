package LinkedList.CircularLinkedList;

class Node1{
    int data;
    Node1 next;
    Node1(int d){
        data = d;
        next = null;
    }
}
public class sortInsert {
    Node1 head = null;
    void sortedInsert(Node1 new_node) {
        Node1 current = head;

        if (current == null){
            new_node.next = new_node;
            head = new_node;
        } else if(current.data >= new_node.data) {
            while (current.next != head)
                current = current.next;

            current.next = new_node;
            new_node.next = head;
            head = new_node;
        } else {
            while (current.next != head && current.next.data < new_node.data)
                current = current.next;
            new_node.next = current.next;
            current.next = new_node;
        }
    }
    void printList()
    {
        if (head != null)
        {
            Node1 temp = head;
            do
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }  while (temp != head);
        }
    }
    public static void main(String[] args) {
        sortInsert si = new sortInsert();
        int [] arr = {5,4,2,1,3};
        Node1 temp = null;
        for (int i = 0; i < arr.length; i++) {
            temp = new Node1(arr[i]);
            si.sortedInsert(temp);
        }
        si.printList();
    }
}
