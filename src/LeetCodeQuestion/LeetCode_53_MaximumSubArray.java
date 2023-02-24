package LeetCodeQuestion;

public class LeetCode_53_MaximumSubArray {
    public static int maxSubArray(int[] nums){
        if (nums.length == 1) return nums[0];
        int finalSum = nums[0], currSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (currSum < 0){
                currSum = 0;
            }
            currSum += nums[i];
            finalSum = Math.max(currSum,finalSum);
        }
        return finalSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
