package LeetCodeQuestion;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_78_Subsets {


    // Approach - 1 [ BackTracking ]
    public static int n,k;
    static List<List<Integer>> result1 = new ArrayList<>();

    public static void backTrack(int first, ArrayList<Integer> curr, int[] nums){
        if (curr.size() == k){
            result1.add(new ArrayList<>(curr));
            return;
        }
        for (int i = first; i < n; i++) {
            curr.add(nums[i]);
            backTrack(i+1,curr,nums);
            curr.remove(curr.size()-1);
        }
    }
    static List<List<Integer>> subSet1(int[] nums){
        n = nums.length;
        for(int k = 0; k < n + 1; ++k){
            backTrack(0,new ArrayList<>(),nums);
        }
        return result1;
    }
    // Approach - 1 ends here


    // Approach - 2 [ Lexicography ]
    public static List<List<Integer>> subSet2(int[] nums){
        List<List<Integer>> result2 = new ArrayList<>();
        int n = nums.length;
        for (int i = (int)Math.pow(2,n); i < (int)Math.pow(2,n+1); i++) {
            String bitmask = Integer.toBinaryString(i).substring(1);
            List<Integer> curr = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if(bitmask.charAt(j) == '1') curr.add(nums[j]);
            }
            result2.add(curr);
        }
        return result2;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println("Approach - 1");
        System.out.println(subSet1(nums));
        System.out.println("Approach - 2");
        System.out.println(subSet2(nums));
    }
}
