package LeetCodeQuestion;

public class LeetCode_1822_signoftheproductofanarray {
    public static int signOfProduct(int[] nums) {
        int sign = 1;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                sign = -1 * sign;
            }
        }
        return sign;
    }

    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,1,2,3,4};
        System.out.println(signOfProduct(nums));
    }
}
