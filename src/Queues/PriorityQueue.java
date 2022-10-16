package Queues;

public class PriorityQueue {
    static class item {
        public int value;
        public int priority;
    };


    static item[] pr = new item[100000];
    static int size = -1;
    static void enqueue(int value, int priority)
    {
        size++;
        pr[size] = new item();
        pr[size].value = value;
        pr[size].priority = priority;
    }
    static int peek() {
        int highestPriority = Integer.MIN_VALUE;
        int ind = -1;
        for (int i = 0; i <= size; i++) {
            if (highestPriority == pr[i].priority && ind > -1 && pr[ind].value < pr[i].value) {
                highestPriority = pr[i].priority;
                ind = i;
            } else if (highestPriority < pr[i].priority) {
                highestPriority = pr[i].priority;
                ind = i;
            }
        }
        return ind;
    }
    static void dequeue() {
        int ind = peek();

        for (int i = ind; i < size; i++) {
            pr[i] = pr[i + 1];
        }
        size--;
    }

    public static void main(String[] args) {
        enqueue(10, 2);
        enqueue(14, 4);
        enqueue(16, 4);
        enqueue(12, 3);
        int ind = peek();
        dequeue();
        ind = peek();
        System.out.println(pr[ind].value);
        dequeue();
        ind = peek();
        System.out.println(pr[ind].value);
    }
}
