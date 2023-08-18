package GeeksForGeeksSolutions;

import java.util.Arrays;

public class waveArray {
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void makeWaveArray(int[] arr, int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i += 2) {
            swap(arr, i, i + 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
        makeWaveArray(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
