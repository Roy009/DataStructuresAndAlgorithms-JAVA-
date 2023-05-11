package LeetCodeQuestion;

public class LeetCode_59_SpiralMatrix {
    public static int[][] spiralMatrix2(int n){
        int[][] result = new int[n][n];
        int count = 1;
        for (int layer = 0; layer < (n+1)/2; layer++) {
            // Left to Right
            for (int i = layer + 1; i < n-layer; i++) {
                result[layer][i] = count++;
            }
            // Top to Bottom
            for (int i = layer + 1; i < n-layer; i++) {
                result[i][n-layer-1] = count++;
            }
            // Right to Left
            for (int i = layer+1; i < n-layer; i++) {
                result[n-layer-1][n-i-layer] = count++;
            }
            // Bottom to Top
            for (int i = layer+1; i < n-layer-1; i++) {
                result[n-i-layer][layer] = count++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = spiralMatrix2(3);
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
