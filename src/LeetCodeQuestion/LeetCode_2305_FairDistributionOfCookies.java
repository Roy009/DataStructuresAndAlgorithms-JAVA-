package LeetCodeQuestion;

public class LeetCode_2305_FairDistributionOfCookies {
    public static int helper(int idx, int[] cookies, int k, int[] dp){
        if(idx < 0) {
            int max = 0;
            for (int d : dp) {
                max = Math.max(max, d);
            }
            return max;
        }
        int curr = Integer.MAX_VALUE;
        for(int j = 0; j < k; j++){
            dp[j] += cookies[idx];
            curr = Math.min(curr, helper(idx - 1, cookies, k, dp));
            dp[j] -= cookies[idx];
        }
        return curr;
    }
    public static int distributeCookies(int[] cookies, int k){
        int[] dp = new int[k];
        int n = cookies.length;
        return helper(n - 1, cookies, k, dp);
    }
    public static void main(String[] args) {
        int[] cookies = {8,15,10,20,8};
        int k = 2;
        System.out.println(distributeCookies(cookies, k));
    }
}
