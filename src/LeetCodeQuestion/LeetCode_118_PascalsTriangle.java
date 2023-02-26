package LeetCodeQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_118_PascalsTriangle {
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
