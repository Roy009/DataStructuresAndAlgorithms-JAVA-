package Arrays;

import java.util.Arrays;

public class removeDuplicatesInArray {
    public static int removeDuplicates(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,4,3,6,1};
//        System.out.println(Arrays.toString(removeDuplicates(arr)));
        System.out.println(removeDuplicates(arr));
    }
}
