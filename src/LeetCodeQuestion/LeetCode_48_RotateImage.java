package LeetCodeQuestion;

public class LeetCode_48_RotateImage {
    public static void rotate(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat.length; j++) {
                int temp = 0;
                temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length/2; j++) {
                int temp = 0;
                temp = mat[i][j];
                mat[i][j] = mat[i][mat.length - 1 - j];
                mat[i][mat.length - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(mat);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
