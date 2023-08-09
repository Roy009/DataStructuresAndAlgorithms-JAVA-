package Matrixs;

public class SumOfDiagonalElements {
    public static int sumOfDiagonals(int[][] arr){
        int sum = 0;
        int n = arr.length;
        int row = 0, col = n-1;
        for (int i = 0; i < n; i++) {
            sum += arr[row][col] + arr[row][row];
            col--;
            row++;
        }
        if(n % 2 == 0){
            return sum;
        }else{
            return (sum - arr[n/2][n/2]);
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sumOfDiagonals(matrix));
        // 1 2 3
        // 4 5 6
        // 7 8 9
    }
}
