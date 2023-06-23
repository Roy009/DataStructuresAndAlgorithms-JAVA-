package LeetCodeQuestion;

public class LeetCode_240_SearchIn2DMatrix_II {
    public static boolean findTarget(int[][] matrix, int target){
        int row = matrix.length-1;
        int col = 0;
        while(row< matrix.length & col < matrix[0].length) {
            if (matrix[row][col] == target) return true;
            else if(row != 0 && matrix[row][col] > target) row--;
            else col++;
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
        System.out.println(findTarget(matrix,target));
    }
}
