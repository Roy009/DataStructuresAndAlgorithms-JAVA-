package LeetCodeQuestion;

public class LeetCode_1493_LongestSubArrayOf1AfterDeletingOneElement {
    public static int longestSubArray(int[] nums){
        int start = 0;
        int longestWindow = 0;
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            zeroCount  += (nums[i] == 0 ? 1 : 0);
            while(zeroCount > 1){
                zeroCount -= nums[start] == 0 ? 1 : 0;
                start++;
            }
            longestWindow = Math.max(longestWindow,i - start);
        }
        return longestWindow;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,1};
        System.out.println(longestSubArray(nums));
    }
}
