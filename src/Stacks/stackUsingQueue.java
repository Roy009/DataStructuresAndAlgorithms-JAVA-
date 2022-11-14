package Stacks;

import java.util.LinkedList;
import java.util.Queue;

public class stackUsingQueue {
    static class stack {
        static Queue<Integer> q1 = new LinkedList<Integer>();
        static Queue<Integer> q2 = new LinkedList<Integer>();
        static int currSize;
        static void push(int x){
            q2.add(x);
            while (!q2.isEmpty()){
                q2.add(q1.peek());
                q1.remove();
            }
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }
        void pop(){
            if (q1.isEmpty()){
                return;
            }
            q1.remove();
        }
        int top(){
            if (q1.isEmpty())
                return -1;
            return q1.peek();
        }
        int size(){
            return q1.size();
        }

    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Size " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        System.out.println("Size " + s.size());
    }
}
