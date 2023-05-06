package LeetCodeQuestion;
import java.util.Arrays;

// Question - 1498
// You are given an array of integers nums and an integer target. Return the number of non-empty subsequences of
// nums such that the sum of the minimum and maximum element on it is less or equal to target.
// Since the answer may be too large, return it modulo 109 + 7.



public class LeetCode_1498_NumberOfSequences {
    public static int numberOfSequences(int[] nums, int target){
        int n = nums.length;
        int mod = 1_000_000_007;
        Arrays.sort(nums);
        int[] power = new int[n];
        power[0] = 1;
        for (int i = 1; i < n; ++i) {
            power[i] = (power[i - 1] * 2) % mod;
        }
        int ans = 0;
        int left = 0, right = n - 1;
        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                ans+= power[right - left];
                ans%= mod;
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3,5,6,7};
        int target = 9;
        System.out.println(numberOfSequences(nums,target));
    }
}
