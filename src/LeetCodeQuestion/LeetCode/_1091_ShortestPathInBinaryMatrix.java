package LeetCodeQuestion.LeetCode;

import java.util.ArrayDeque;
import java.util.Queue;

public class _1091_ShortestPathInBinaryMatrix {
    static int ROW, COL;
    public static int shortestPathBinaryMatrix(int[][] grid) {
        ROW = grid.length;
        COL = grid[0].length;
        if (grid[0][0] != 0 || grid[ROW - 1][COL - 1] != 0) {
            return -1;
        }
        Queue<int[]> q = new ArrayDeque<>();
        int[][] dirs = new int[][]{{1,0},{1,-1},{0,-1},{-1,-1},{-1,0},{-1,1},{0,1},{1,1}};
        q.offer(new int[]{0, 0});
        grid[0][0] = 1;
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int row = cur[0];
            int col = cur[1];
            int distance = grid[row][col];
            if(row == ROW-1 && col == COL-1) {
                return distance;
            }
            for(int[] dir : dirs) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if(isBound(newRow, newCol) && grid[newRow][newCol] == 0) {
                    q.offer(new int[]{newRow, newCol});
                    grid[newRow][newCol] = distance + 1;
                }
            }
        }
        return -1;
    }

    static boolean isBound(int row, int col) {
        return row>=0 && row<ROW && col>=0 && col<COL;
    }
    public static void main(String[] args) {
        int[][] grid = {{0,1},{1,0}};
        System.out.println(shortestPathBinaryMatrix(grid));
    }
}
