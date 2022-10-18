package LinkedList.SinglyLinkedList;

import java.util.Stack;

public class palindromeLinkedList {
    Node10 head;
    static class Node10{
        int data;
        Node10 next;
        Node10(int d){
            next = null;
            data = d;
        }
    }
    static boolean isPalindrome(Node10 head){
        Node10 slow = head;
        boolean isPalin = true;
        Stack<Integer> stack = new Stack<>();

        while (slow != null){
            stack.push(slow.data);
            slow = slow.next;
        }
        while (head != null){
            int i = stack.pop();
            if (head.data == i) {
                isPalin = true;
            }else {
                isPalin = false;
                break;
            }
            head = head.next;
        }
        return isPalin;
    }
    public static void main(String[] args) {
        Node10 one = new Node10(1);
        Node10 two = new Node10(2);
        Node10 three = new Node10(3);
        Node10 four = new Node10(4);
        Node10 five = new Node10(3);
        Node10 six = new Node10(2);
        Node10 seven = new Node10(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        boolean result = isPalindrome(one);
        System.out.println("The list is palindrome " + result);
    }
}
