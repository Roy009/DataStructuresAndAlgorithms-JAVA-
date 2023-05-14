package LeetCodeQuestion;

// Leetcode - 42
//Given n non-negative integers representing an elevation map where the width of each bar is 1,
// compute how much water it can trap after raining.



public class LeetCode_42_TrappingRainWater {
    public static int trappingRainWater(int[] height) {
        if(height.length == 0) return 0;
        int ans = 0;
        int len = height.length;
        int[] left = new int [len];
        int[] right = new int [len];
        left[0] = height[0];
        for(int i = 1; i < len; i++){
            left[i] = Math.max(height[i], left[i - 1]);
        }
        right[len - 1] = height[len - 1];
        for(int i = len - 2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i + 1]);
        }
        for(int i = 1; i < len - 1; i++) {
            ans += Math.min(left[i], right[i]) - height[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingRainWater(height));
    }
}
