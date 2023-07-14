package LeetCodeQuestion;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_1218_LongestArithmeticSubsequenceOfGivenDifference {
    public static int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> dp = new HashMap<>();
        int answer = 1;

        for (int a : arr) {
            int beforeA = dp.getOrDefault(a - difference, 0);
            dp.put(a, beforeA + 1);
            answer = Math.max(answer, dp.get(a));
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int dif = 1;
        System.out.println(longestSubsequence(arr,dif));
    }
}
