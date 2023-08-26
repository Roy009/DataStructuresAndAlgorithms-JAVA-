package GeeksForGeeksSolutions;

import java.util.Arrays;

public class ReorderAnArrayElementAccordingToIndexes {
    public static int[] reorderArrayAccordingToIndexes(int[] arr, int[] index){
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
    public static void main(String[] args) {
        int[] arr = {11,10,12};
        int[] index = {1,0,2};
        System.out.println(Arrays.toString(reorderArrayAccordingToIndexes(arr,index)));

    }
}
