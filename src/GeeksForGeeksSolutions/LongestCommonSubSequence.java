package GeeksForGeeksSolutions;

import java.util.Arrays;

public class LongestCommonSubSequence {
//    public static int lcs(String s1, String s2, int x, int y){
//        int[][] dp = new int[x+1][y+1];
//        int ans = helper(s1,s2,x,y,dp);
//        return ans;
//    }
//    static int helper(String s1, String s2, int x, int y, int[][] dp){
//        for (int[] dps: dp) {
//            Arrays.fill(dps,-1);
//        }
//        if(x == 0 || y == 0) return 0;
//        if(s1.charAt(x-1) == s2.charAt(y-1)){
//            dp[x][y] = 1 + helper(s1,s2,x-1,y-1,dp);
//            return dp[x][y];
//        }
//        dp[x][y] = Math.max(helper(s1,s2,x-1,y,dp), helper(s1,s2,x,y-1,dp));
//        return dp[x][y];
//    }


    public static int lcs(String s1, String s2, int x, int y){
        int[][] dp = new int[x+1][y+1];
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                } else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    dp[i][j] = max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[x][y];
    }
    static int max(int x, int y){
        return (x > y) ? x : y;
    }



    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        int x = s1.length();
        int y = s2.length();
        System.out.println(lcs(s1,s2,x,y));
    }
}
