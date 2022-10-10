package Queues;

class Queue {
    int front, rear, size;
    int capacity;
    int [] arr;

    Queue(int capacity){
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        arr = new int[this.capacity];
    }

    // Checking the queue is full or not
    boolean isFull(Queue queue){
        return (queue.size == queue.capacity);
    }

    // Checking the queue is empty or not
    boolean isEmpty(Queue queue){
        return (queue.size == 0);
    }

    // Inserting element in the queue
    void enqueue(int item){
        if (isFull(this))
            return;
        this.rear = (this.rear + 1) % this.capacity;
        this.arr[this.rear] = item;
        this.size = this.size + 1;
        System.out.println(item + " enqueued to queue");
    }

    // Deleting element form the queue
    int dequeue(){
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        int item = this.arr[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }
    int getFront(){
        if (isEmpty(this)){
            return Integer.MIN_VALUE;
        }
        return this.arr[this.front];
    }
    int getRear(){
        if (isEmpty(this)){
            return Integer.MIN_VALUE;
        }
        return this.arr[this.rear];
    }
}
public class QueueArrayImp{
    public static void main(String[] args) {
        Queue queue = new Queue(50);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println("Front item is " + queue.getFront());
        System.out.println("Rear item is " + queue.getRear());
        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println("Front item is " + queue.getFront());
        System.out.println("Rear item is " + queue.getRear());
    }
}
