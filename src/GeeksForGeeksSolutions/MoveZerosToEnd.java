package GeeksForGeeksSolutions;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static int[] moveZerosToEnd(int[] arr){
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
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0};
        System.out.println(Arrays.toString(moveZerosToEnd(arr)));
    }
}
