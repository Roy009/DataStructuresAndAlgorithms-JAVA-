package LeetCode_BinarySearch;
import java.util.*;
public class CountPairsWhoseSumisLessthanTarget_2824 {
    public static int countPairs(List<Integer> nums, int target) {
        int left = 0;
        int right = nums.size()-1;
        int count = 0;
        Collections.sort(nums);
        while(left < right){
            if(nums.get(left) + nums.get(right) < target){
                count += right - left;
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        System.out.println(countPairs(nums,2));

    }
}
