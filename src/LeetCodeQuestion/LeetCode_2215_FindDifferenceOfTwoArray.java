package LeetCodeQuestion;

import java.util.*;

public class LeetCode_2215_FindDifferenceOfTwoArray {
    public static List<List<Integer>> findDifferenceOfTwoArray(int[] nums1, int[] nums2){
        return Arrays.asList(getELementsInFirstArray(nums1,nums2), getELementsInFirstArray(nums2, nums1));
    }
    public static List<Integer> getELementsInFirstArray(int[] nums1, int[] nums2){
        Set<Integer> onlyInNum1 = new HashSet<>();
        Set<Integer> existsInNum2 = new HashSet<>();
        for(int num : nums2) {
            existsInNum2.add(num);
        }
        for (int num : nums1) {
            if (!existsInNum2.contains(num)){
                onlyInNum1.add(num);
            }
        }
        return new ArrayList<>(onlyInNum1);
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        System.out.println(findDifferenceOfTwoArray(nums1,nums2));
    }
}
