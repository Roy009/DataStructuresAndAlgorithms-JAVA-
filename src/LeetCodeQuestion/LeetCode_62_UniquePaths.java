package LeetCodeQuestion;

public class LeetCode_62_UniquePaths {
    // Approach 1 [ Recursion ] Note -> Will Give TLE
    static int uniquePath1(int m, int n){
        return countPaths(0,0,n,m);
    }

    private static int countPaths(int i, int j, int n, int m) {
        if(i == (n-1) && j == (m-1)) return 1;
        if(i >= n || j >= m) return 0;
        return countPaths(i+1,j,n,m) + countPaths(i,j+1,n,m);
    }
    // Approach 2 [ Combinatorics ] Note -> Most Optimal Solution
    static int uniquePath2(int m , int n){
        int N = n + m - 2;
        int r = m - 1;
        double res = 1;
        for (int i = 1; i <= r; i++)
            res = res * (N - r + i) / i;
        return (int)res;
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        System.out.println(uniquePath1(m,n));
        System.out.println(uniquePath2(m,n));
    }
}
