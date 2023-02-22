package LeetCodeQuestion;

public class LeetCode_152_MaximumProductSubArray {
    static public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            int temp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]),nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            if(max > ans){
                ans = max;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        System.out.println(maxProduct(arr));
    }
}
