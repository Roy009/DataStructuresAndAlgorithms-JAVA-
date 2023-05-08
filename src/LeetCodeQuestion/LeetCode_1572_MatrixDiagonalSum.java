package LeetCodeQuestion;

public class LeetCode_1572_MatrixDiagonalSum {
    public static int matrixDiagonalSum(int[][]mat){
        int n = mat.length;
        int res = 0;
        for(int i = 0; i < n; i++){
            res += mat[i][i];
            res += mat[n - 1 - i][i];
        }
        if(n % 2 != 0){
            res -= mat[n / 2][n / 2];
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6}, {7,8,9}};
        System.out.println(matrixDiagonalSum(mat));
    }
}
