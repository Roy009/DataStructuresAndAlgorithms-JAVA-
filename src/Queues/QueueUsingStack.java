package Queues;

import java.util.Stack;

public class QueueUsingStack {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        static void enQueue(int x){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(x);
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        static int deQueue(){
            if (s1.isEmpty()){
                System.out.println("The Queue is empty");
                return 0;
            }
            int x = s1.peek();
            s1.pop();
            return x;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        System.out.println("Element " + q.deQueue()+" is deleted form the queue");
        System.out.println("Element " + q.deQueue()+" is deleted form the queue");
        System.out.println("Element " + q.deQueue()+" is deleted form the queue");
    }
}
