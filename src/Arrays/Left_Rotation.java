package Arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class Left_Rotation {

    public  static  void leftRotate1(int arr[], int d, int n){
        int p = 1;
        while (p <= d) {
            // Storing the first element in the temp variable last
            int last = arr[0];
            // rotating/ shifting one variable at a time
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            // Storing the first element at the last position of the array
            arr[n - 1] = last;
            // increasing the p variable
            p++;
        }
        // printing the array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void leftRotate2(int[] arr, int d){
        if (d == 0){
            return;
        }
        int n = arr.length;
        d = d % n;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d,n - 1);
        reverseArray(arr, 0, n - 1);
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

    static void leftRotate3(int[] arr, int d){
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

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        // rotate the array by d time
        int d = 3;
        // Left rotation function
        System.out.println("Method - 1");
        leftRotate1(arr, d, n);
        System.out.println();
        System.out.println("Method - 2");
        leftRotate2(arr,d);
        printArray(arr);
        System.out.println();
        System.out.println("Method - 3");
        leftRotate3(arr,d);
    }
}
