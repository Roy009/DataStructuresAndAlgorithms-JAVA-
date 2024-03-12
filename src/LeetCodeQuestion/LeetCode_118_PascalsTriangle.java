package LeetCodeQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_118_PascalsTriangle {
    // Approach - 2
    public static List<Integer> generateRow(int row){
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for(int i = 1; i < row; i++){
            ans = ans * (row - i);
            ans = ans / i;
            ansRow.add(ans);
        }
        return ansRow;
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
    // Approach - 2
    static List<List<Integer>>pascalTriangle(int numRows){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> row, pre = null;
        for (int i = 0; i < numRows; ++i) {
            row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i){
                    row.add(1);
                }else{
                    row.add(pre.get(j-1) + pre.get(j));
                }
            }
            pre = row;
            ans.add(row);
        }
        return ans;
    }
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int numRows = 5;
        ans = pascalTriangle(numRows);
        System.out.println(Arrays.toString(ans.toArray()));

    }
}
