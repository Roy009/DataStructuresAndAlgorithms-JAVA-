package Arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class Right_Rotation {
    static void leftRotate1(int[] arr, int d){
        if (d == 0){
            return;
        }
        int n = arr.length;
        d = d % n;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d,n - 1);
        reverseArray(arr, 0, n - 1);
    }
    static void leftRotate2(int[] arr, int d){
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i : arr) {
            dq.add(i);
        }
        for (int i = 0; i < d; i++) {
            int temp = dq.remove();
            dq.addLast(temp);
        }
        System.out.print(dq);
    }
    static void reverseArray(int arr[], int start, int end){
        int temp;
        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void  printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int d = 2;
        leftRotate1(arr,d);
        printArray(arr);
        leftRotate2(arr,d);
    }
}
