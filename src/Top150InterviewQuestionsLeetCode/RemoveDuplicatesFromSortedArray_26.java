package Top150InterviewQuestionsLeetCode;

public class RemoveDuplicatesFromSortedArray_26 {
    public static int removeElement(int[] nums){
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeElement(nums));
    }
}
