package LeetCodeQuestion;

import java.util.Arrays;

public class LeetCode_1502_CanMakeArithmeticProgressionFromSequence {
    public static boolean canMakeArithmeticProgression(int[] arr){
        Arrays.sort(arr);
        int res = arr[1] - arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i + 1] - arr[i] != res){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,5};
        System.out.println(canMakeArithmeticProgression(arr));
    }
}
