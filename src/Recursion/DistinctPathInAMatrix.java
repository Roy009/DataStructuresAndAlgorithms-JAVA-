package Recursion;

public class DistinctPathInAMatrix {
    public static int uniquePaths(int m, int n) {
        int i = 0;
        int j = 0;
        return 1 + helper(i, j, m, n);
    }
    public static int helper(int i, int j, int m, int n){
        if(i == m - 1 || j == n - 1){
            return 1;
        }
        return helper(i + 1, j, m, n) + helper(i, j + 1, m, n);
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2},{3,4}};
        System.out.println(uniquePaths(matrix.length-1,matrix[0].length-1));
    }
}
