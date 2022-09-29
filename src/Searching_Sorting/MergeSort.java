package Searching_Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12,45,67,11,10,56,90};
        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
    }
    // merging function
    static void merge(int[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] Left = new int[n1];
        int[] Right = new int[n2];

        for (int i = 0; i < n1; ++i) {
            Left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            Right[j] = arr[m + 1 + j];
        }

        int i= 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2){
            if (Left[i] <= Right[j]){
                arr[k] = Left[i];
                i++;
            }else{
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            arr[k] = Left[i];
            i++;
            k++;
        }
        while (j < n2){
            arr[k] = Right[j];
            j++;
            k++;
        }
    }
    static int[] mergeSort(int[] arr, int l, int r){
        if(l < r){
            int m = l + (r - l) / 2;
            mergeSort(arr,l,m);
            mergeSort(arr, m + 1, r);
            merge(arr,l,m,r);
        }
        return arr;
    }
}
