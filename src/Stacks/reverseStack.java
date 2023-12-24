package Stacks;

import java.util.Stack;

public class reverseStack {
    static Stack<Character> stack = new Stack<>();
//    static Stack<Character> s = new Stack<>();
    static void insertAtBottom1(char x){
        if (stack.isEmpty()) {
            stack.push(x);
        } else {
            char a = stack.peek();
            stack.pop();
            insertAtBottom1(x);
            stack.push(a);
        }
    }
    static void reverse1(){
        if (stack.size() > 0){
            char x = stack.peek();
            stack.pop();
            reverse1();
            insertAtBottom1(x);
        }
    }
    public static void insertAtBottom2(Stack<Integer> s ,int x){
        if (s.isEmpty()) {
            s.push(x);
            return;
        } else {
            int a = s.peek();
            s.pop();
            insertAtBottom2(s,x);
            s.push(a);
        }
    }
    static void reverse2(Stack<Integer> s){
        if (s.size() > 0){
            int x = s.peek();
            s.pop();
            reverse2(s);
            insertAtBottom2(s, x);
        }
    }
    public static void main(String[] args) {
        stack.push('1');
        stack.push('2');
        stack.push('3');
        stack.push('4');
        System.out.println("Original Stack");
        System.out.println(stack);
        reverse1();
        System.out.println("Reversed Stack");

        System.out.println(stack);
  }
}
