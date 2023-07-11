package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubArrayWithGivenSum {
    public static void helper(int index,List<Integer> result, int sum, int k, int[] arr){
        if (index == arr.length){
            if (k == sum){
                System.out.println(result);
            }
            return;
        }
        result.add(arr[index]);
        sum += arr[index];
        helper(index + 1, result, sum, k, arr);
        sum -= arr[index];
        result.remove(result.size()-1);
        helper(index + 1, result, sum, k, arr);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k = 2;
        ArrayList<Integer> ans = new ArrayList<>();
        helper(0,ans, 0, k, arr);
    }
}
