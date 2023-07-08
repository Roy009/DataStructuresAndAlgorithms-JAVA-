package LeetCodeQuestion;

import java.util.Arrays;

public class LeetCode_2551_PutMarbelsInBag {
    public static long putMarbels(int[] weights, int k){
        int n = weights.length;
        int[] pairWeights = new int[n - 1];
        for (int i = 0; i < n - 1; ++i) {
            pairWeights[i] = weights[i] + weights[i + 1];
        }
        Arrays.sort(pairWeights, 0, n - 1);
        long answer = 0l;
        for (int i = 0; i < k - 1; ++i) {
            answer += pairWeights[n - 2 - i] - pairWeights[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] weights = {1,3,5,1};
        int k = 2;
        System.out.println(putMarbels(weights, k));
    }
}
