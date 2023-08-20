package Matrixs;

import java.util.Scanner;

public class RotateImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int column = 0; column < n; column++){
            for(int row = n - 1; row >= 0; row--){
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

    }
}
