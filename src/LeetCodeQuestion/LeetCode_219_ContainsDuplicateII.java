package LeetCodeQuestion;

import java.util.*;

public class LeetCode_219_ContainsDuplicateII {
    public static boolean containsDuplicateII(int[] nums, int k){
        if(k == 0) return false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if(map.containsKey(n) && i - map.get(n) <= k){
                return true;
            }
            map.put(n, i);
        }
        return false;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        int k = 3;
        System.out.println(containsDuplicateII(nums, k));
    }
}
