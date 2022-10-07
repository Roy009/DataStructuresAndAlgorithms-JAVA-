package LinkedList.SinglyLinkedList;
class Node1{
    int data;
    Node1 next;
    Node1(int d){
        data = d;
        next = null;
    }
}
public class swapNodes {
    Node1 head;
    public void swapNode(int x, int y){
        if(x == y){
            return;
        }
        Node1 prevX = null;
        Node1 currX = head;
        while (currX != null && currX.data != x){
            prevX = currX;
            currX = currX.next;
        }

        Node1 prevY = null;
        Node1 currY = head;
        while (currY != null && currY.data != y){
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null)
            return;
        if (prevX != null)
            prevX.next = currY;
        else
            head = currY;
        if (prevY != null)
            prevY.next = currX;
        else
            head = currX;
        Node1 temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

    }
    public void push(int new_data){
        Node1 new_node = new Node1(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void printList()
    {
        Node1 tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        swapNodes sw = new swapNodes();
        sw.push(5);
        sw.push(4);
        sw.push(3);
        sw.push(2);
        sw.push(1);
        sw.printList();
        sw.swapNode(3,4);
        sw.printList();
    }
}
