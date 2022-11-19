package Stacks;
class DLLNode{
    int data;
    DLLNode prev;
    DLLNode next;
    DLLNode(int d){
        this.data = d;
    }
}
public class stackOpOnMiddle {
    DLLNode head;
    DLLNode mid;
    DLLNode prev;
    DLLNode next;
    int size;
    void push(int new_data) {
        // Creating a new to be inserted
        DLLNode new_node = new DLLNode(new_data);
        // if the stack is empty then the new node should be head and middle node also
        if (size == 0) {
            head = new_node;
            mid = new_node;
            // increasing the size by 1
            size++;
            return;
        }
        // if it is not the first element then head's next will the new_node
        head.next = new_node;
        new_node.prev = head;
        head = head.next;
        // if the size of the stack is not 0 then keep changing the middle element
        if (size % 2 != 0) {
            mid = mid.next;
        }
        // increase the size by 1
        size++;
    }
    int pop(){
        int data = -1;
        // stack underflow
        if (size == 0){
            System.out.println("Stack is empty");
        }
        if (size != 0) {
            if (size == 1){
                head = null;
                mid = null;
            } else {
                data = head.data;
                head = head.prev;
                head.next = null;
                if (size % 2 != 0) {
                    mid = mid.prev;
                }
            }
            size--;
        }
        return data;
    }
    int findMiddle() {
        if (size == 0){
            System.out.println("Stack is empty now");
            return -1;
        }
        return mid.data;
    }
    void deleteMiddle(){
        if (size != 0) {
            if (size == 1){
                head = null;
                mid = null;
            } else if(size == 2){
                head = head.prev;
                mid = mid.prev;
                head.next = null;
            } else {
                mid.next.prev = mid.prev;
                mid.prev.next = mid.next;
                if (size % 2 != 0) {
                    mid = mid.prev;
                } else{
                    mid = mid.next;
                }
            }
            size--;
        }
    }
    public static void main(String[] args) {
        stackOpOnMiddle stack = new stackOpOnMiddle();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("Popped elements are : " + stack.pop());
        System.out.println("Popped elements are : " + stack.pop());
        System.out.println("Middle element of the stack is : " + stack.findMiddle());
        stack.deleteMiddle();
        System.out.println("New Middle element is : " + stack.findMiddle());
    }
}
