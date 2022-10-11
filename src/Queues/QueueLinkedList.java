package Queues;



class QNode{
    int key;
    QNode next;
    QNode(int key){
        this.key = key;
        this.next = null;
    }
}

public class QueueLinkedList {
    QNode front, rear;
    QueueLinkedList() {
        this.front = this.rear = null;
    }
    void enqueue(int key){
        QNode temp = new QNode(key);

        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }
    void dequeue(){
        if (this.front == null){
            return;
        }
        QNode temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
    }

    public static void main(String[] args) {
        QueueLinkedList qll = new QueueLinkedList();
        qll.enqueue(1);
        qll.enqueue(2);
        qll.enqueue(3);
        qll.enqueue(4);
        qll.enqueue(5);
        System.out.println("Queue Front : " + qll.front.key);
        System.out.println("Queue Rear : " + qll.rear.key);
        qll.dequeue();
        System.out.println("Queue Front : " + qll.front.key);
        System.out.println("Queue Rear : " + qll.rear.key);
    }
}
