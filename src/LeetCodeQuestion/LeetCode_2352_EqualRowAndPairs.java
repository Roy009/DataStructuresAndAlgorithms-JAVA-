package LeetCodeQuestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode_2352_EqualRowAndPairs {
    public static int countOfEqualRowAndColumn(int[][] grid){
        int count = 0, n = grid.length;
        Map<String,Integer> rowCounter = new HashMap<>();

        for (int[] row : grid) {
            String rowString = Arrays.toString(row);
            rowCounter.put(rowString, 1 + rowCounter.getOrDefault(rowString, 0));
        }
        for (int c = 0; c < n; c++){
            int[] col = new int[n];
            for (int r = 0; r < n; r++) {
                col[r] = grid[r][c];
            }
            count += rowCounter.getOrDefault(Arrays.toString(col), 0);
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] grid = {{3,2,1},{1,7,6},{2,7,7}};
        System.out.println(countOfEqualRowAndColumn(grid));
    }
}
