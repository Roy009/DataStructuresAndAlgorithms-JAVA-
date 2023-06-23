package LeetCodeQuestion;

import java.util.Arrays;

public class LeetCode_240_SearchIn2DMatrix_II {
    // Optimal approach O(row + col)
    public static boolean findTarget1(int[][] matrix, int target){
        int row = matrix.length-1;
        int col = 0;
        while(row< matrix.length & col < matrix[0].length) {
            if (matrix[row][col] == target) return true;
            else if(row != 0 && matrix[row][col] > target) row--;
            else col++;
        }
        return false;
    }
    public static boolean findTarget2(int[][] matrix, int target){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean findTarget3(int[][] matrix, int target){
        for (int i = 0; i < matrix.length; i++) {
            if (Arrays.binarySearch(matrix[i], target) > -1) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int target = 5;
        System.out.println("Optimal Method - O(row + col)");
        System.out.println(findTarget1(matrix,target));
        System.out.println("Simply Matrix Search - O(N^2)");
        System.out.println(findTarget2(matrix,target));
        System.out.println("Using Inbuilt Binary Search Method - O(m + log(n))");
        System.out.println(findTarget3(matrix,target));
    }
}
