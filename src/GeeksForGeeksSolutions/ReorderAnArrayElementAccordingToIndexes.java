package GeeksForGeeksSolutions;

import java.util.Arrays;

public class ReorderAnArrayElementAccordingToIndexes {
    public static int[] reorderArrayAccordingToIndexes1(int[] arr, int[] index){
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[index[i]] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
            index[i] = i;
        }
        return arr;
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static int[] reorderArrayAccordingToIndexes2(int[] arr, int[] index){
        for (int i = 0; i < arr.length; i++) {
            while(index[i] != i){
                swap(arr, i, index[i]);
                swap(index, i, index[i]);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {11,10,12};
        int[] index = {1,0,2};
        System.out.println(Arrays.toString(reorderArrayAccordingToIndexes1(arr,index)));
        System.out.println(Arrays.toString(reorderArrayAccordingToIndexes2(arr,index)));

    }
}
