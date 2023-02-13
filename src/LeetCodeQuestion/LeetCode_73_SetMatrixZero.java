package LeetCodeQuestion;

import java.util.HashSet;
import java.util.Set;

public class LeetCode_73_SetMatrixZero {
    static int[][] setMatrixZero(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        Set<Integer> row_index = new HashSet<>();
        Set<Integer> col_index = new HashSet<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0){
                    row_index.add(i);
                    col_index.add(j);
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (row_index.contains(i) || col_index.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,1,1}, {1,0,1},{1,1,1}};
        System.out.println("Before setting matrix to zero");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        setMatrixZero(arr);
        System.out.println("After setting matrix to zero");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
