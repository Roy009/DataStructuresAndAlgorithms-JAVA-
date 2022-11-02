package Stacks;

public class twoStackArray {
    int[] arr;
    int size;
    int top1, top2;
    twoStackArray(int n){
        size = n;
        arr = new  int[n];
        top1 = n / 2 + 1;
        top2 = n / 2;
    }
    void push1(int x){
        if (top1 > 0) {
            top1--;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow By element : " + x);
            return;
        }
    }
    void push2(int x){
        if (top2 < size - 1) {
            top2++;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow By element : " + x);
            return;
        }
    }
    int pop1(){
        if (top1 <= size / 2) {
            int x = arr[top1];
            top1++;
            return x;
        } else {
            System.out.println("Stack UnderFlow");
        }
        return 0;
    }
    int pop2(){
        if (top2 >= size / 2 + 1){
            int x = arr[top2];
            top2--;
            return x;
        } else {
            System.out.println("Stack UnderFlow");
        }
        return 1;
    }

    public static void main(String[] args) {
        twoStackArray tsa = new twoStackArray(5);
        tsa.push1(5);
        tsa.push2(10);
        tsa.push2(15);
        tsa.push1(11);
        tsa.push2(7);
        System.out.println("Popped element form the stack1 is : " + tsa.pop1());
        System.out.println("Popped element form the stack2 is : " + tsa.pop2());
    }
}
