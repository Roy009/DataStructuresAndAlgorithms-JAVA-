package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class InsertingAtBottom {
    public static void insertAtBottom(Stack<Integer> s, int N){
        Stack<Integer> temp = new Stack<>();
        while(!s.isEmpty()){
            temp.push(s.peek());
            s.pop();
        }
        s.push(N);
        while(!temp.isEmpty()){
            s.push(temp.peek());
            temp.pop();
        }
        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        insertAtBottom(stack, 5);
    }
}
