package LeetCodeQuestion;

public class LeetCode_2439_MinimizeMaximumArray {
    public static int minimizeMaximumArray(int[] nums){
        long sum = 0, res = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            res = Math.max(res,(sum + i) / (i + 1));
        }
        return (int)res;
    }
    public static void main(String[] args) {
        int[] nums = {3,7,1,6};
        System.out.println(minimizeMaximumArray(nums));
    }
}
