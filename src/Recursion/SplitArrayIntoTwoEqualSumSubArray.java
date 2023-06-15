package Recursion;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

public class SplitArrayIntoTwoEqualSumSubArray {
    public static int findSplit(int[] arr){
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            int rightSum = 0;
            for (int j = i+1; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if(leftSum == rightSum) return i+1;
        }
        return -1;
    }
    public static List<List<Integer>> printSplitArray(int[] arr){
        int splitPoint = findSplit(arr);
        List<List<Integer>> ans = new ArrayList<>();
        if (splitPoint == -1 || splitPoint == arr.length) {
            ans.add(new ArrayList<>());
        }
        List<Integer> leftResult = new ArrayList<>();
        List<Integer> rightResult = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(splitPoint > i){
                leftResult.add(arr[i]);
            }
            if (splitPoint <= i && i <= arr.length-1){
                rightResult.add(arr[i]);
            }
        }
        ans.add(new ArrayList<>(leftResult));
        ans.add(new ArrayList<>(rightResult));
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {4,1,2,3};
        System.out.println(printSplitArray(nums));
    }
}
