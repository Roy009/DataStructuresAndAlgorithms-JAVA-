package Top150InterviewQuestionsLeetCode;

public class RemoveDuplicatesFromSortedArray_80 {
    public static int removeDuplicates(int[] nums) {
        int x = 2;
        for (int i = x; i < nums.length; i++) {
            if (nums[i] != nums[x - 2]) {
                nums[x++] = nums[i];
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
}
