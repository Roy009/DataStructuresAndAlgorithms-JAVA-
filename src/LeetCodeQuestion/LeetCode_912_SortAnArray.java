package LeetCodeQuestion;

import java.util.PriorityQueue;

public class LeetCode_912_SortAnArray {
    static int[] sortArray(int[] arr){
        int[] ans = new int[arr.length];
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int n: arr) {
            queue.offer(n);
        }
        int i = 0;
        while (!queue.isEmpty()){
            arr[i++] = queue.poll();
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,5,9,10};
        sortArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
