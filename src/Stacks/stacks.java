package Stacks;

class stacksDataStructure{
    // Limiting the size of the stack
    static final int MAX = 1000;
    // top element of the stack
    int top;
    int []arr = new int[MAX];

    // returns that the stack is empty or not
    boolean isEmpty(){
        return (top < 0);
    }
    // constructor
    stacksDataStructure(){
        top = -1;
    }
    // pushing the elements in the stack
    boolean push(int x){
        if (top >= (MAX - 1)){
            System.out.println("Stack Overflow");
            return false;
        } else{
            arr[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }
    // pop or delete the top element in the stack
    int pop(){
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else{
            int x = arr[top--];
            return x;
        }
    }
    // seeing the top most element of the stack
    int peek(){
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = arr[top];
            return x;
        }
    }
    // Printing the stack
    void printStack(){
        for (int i = top; i > -1 ; i--) {
            System.out.println(" " + arr[i]);
        }
    }
}
public class stacks {
    public static void main(String[] args) {
        stacksDataStructure s = new stacksDataStructure();
        s.push(1);
        s.push(2);
        s.push(3);
        s.printStack();
        s.pop();
        s.printStack();
        s.peek();
        s.isEmpty();
        System.out.println(90 / 12 * 23);
        System.out.println();
    }
}
