package Searching_Sorting;

import java.util.Arrays;

public class BubbleSort {

    static void bubble_sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,2,3,1};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
