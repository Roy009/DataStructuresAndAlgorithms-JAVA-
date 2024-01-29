package Arrays;

import java.util.*;

public class LongestSubArrayWithGivenSumK {
    // Using Two Loops
    public static int getLongestSubArray1(int[] arr, int k){
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == k){
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }
    // Using HashMap
    public static int getLongestSubArray2(int[] arr, int k){
        Map<Integer, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        long maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum == k){
                maxLen = Math.max(maxLen, i + 1);
            }
            long rem = sum - k;
            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if(!preSumMap.containsKey(sum)){
                preSumMap.put((int) sum, i);
            }
        }
        return (int)maxLen;
    }
    // Using Two Pointer
    public static int getLongestSubArray3(int[] arr, int k){
        int n = arr.length;
        int left = 0, right = 0;
        long sum = arr[0];
        int maxlen = 0;
        while(right < n){
            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxlen = Math.max(maxlen, right - left + 1);
            }
            right++;
            if (right < n) sum += arr[right];
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 6;
        System.out.println("Using Two Loops "+ getLongestSubArray1(arr, k));
        System.out.println("Using HashMap " + getLongestSubArray2(arr, k));
        System.out.println("Using Two Pointer " + getLongestSubArray3(arr, k));
    }
}
