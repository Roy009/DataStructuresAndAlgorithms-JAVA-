package LeetCodeQuestion;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_2130_MaximumTwinSumOfALinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public void push(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static int maximumTwinSumOfALinkedList(Node head){
        Node curr = head;
        List<Integer> values = new ArrayList<>();
        while(curr != null) {
            values.add(curr.data);
            curr = curr.next;
        }
        int i = 0, j = values.size()-1;
        int maxSum = 0;
        while(i < j) {
            maxSum = Math.max(maxSum,values.get(i) + values.get(j));
            i++;
            j--;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        LeetCode_2130_MaximumTwinSumOfALinkedList list = new LeetCode_2130_MaximumTwinSumOfALinkedList();
        list.push(1);
        list.push(2);
        list.push(4);
        list.push(5);
        int result = maximumTwinSumOfALinkedList(list.head);
        System.out.print("List -> " );
        list.printList();
        System.out.println("\nThe Sum is -> "+result);
    }
}
