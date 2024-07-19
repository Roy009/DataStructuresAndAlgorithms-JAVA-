package LeetCodeQuestion;
import java.util.*;

public class LeetCode_1380_LuckyNumberInMatrix {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            int rowMin = Integer.MAX_VALUE;
            int rowMinIndex = -1;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    rowMinIndex = j;
                }
            }
            boolean isLucky = true;
            for (int k = 0; k < n; k++) {
                if (matrix[k][rowMinIndex] > rowMin) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) {
                ans.add(rowMin);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(matrix));
    }
}
