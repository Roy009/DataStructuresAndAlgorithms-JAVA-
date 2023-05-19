package LeetCodeQuestion;

public class LeetCode_70_ClimbingStairs {
    public static int climbingStairs1(int n){
        if (n < 2) return 1;
        int[] dp = new int[n+2];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    public static int climbingStairs2(int n){
        if (n < 2) return 1;
        int prev1 = 1;
        int prev2 = 1;
        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        return prev2;
    }
    public static void main(String[] args) {
        System.out.println("Using DP Array : " + climbingStairs1(3));
        System.out.println("Space Optimized : " + climbingStairs2(3));
    }
}
