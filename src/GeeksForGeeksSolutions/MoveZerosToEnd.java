package GeeksForGeeksSolutions;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static int[] moveZerosToEnd1(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        while(count < arr.length){
            arr[count++] = 0;
        }
        return arr;
    }
    public static int[] moveZerosToEnd2(int[] arr){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                swap(arr, j, i);
                j++;
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,0,2,0,3,0};
        int[] arr2 = {1,0,2,0,3,0};
        System.out.println(Arrays.toString(moveZerosToEnd1(arr1)));
        System.out.println(Arrays.toString(moveZerosToEnd2(arr2)));
    }
}
