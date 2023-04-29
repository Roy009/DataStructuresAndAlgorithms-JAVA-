package Dynamic_Programming;

public class fibonacci {

    // Method - 1
    static int fibonacciNumber1(int n){
        return n <= 1 ? n : fibonacciNumber1(n - 1) + fibonacciNumber1(n - 2);
    }
    // Method - 2
    static int fibonacciNumber2(int n){
        int[]dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(fibonacciNumber1(4));
        System.out.println(fibonacciNumber2(4));
    }
}
