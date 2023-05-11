package LeetCodeQuestion;

public class LeetCode_1035_UncrossedLines {
    public static int uncrossedLines(int[] nums1, int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[][] dp = new int[n1+1][n2+1];
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[n1][n2];
    }

    public static void main(String[] args) {
        int[] nums1 = {1,4,2};
        int[] nums2 = {1,2,4};
        System.out.println(uncrossedLines(nums1,nums2));
    }
}
