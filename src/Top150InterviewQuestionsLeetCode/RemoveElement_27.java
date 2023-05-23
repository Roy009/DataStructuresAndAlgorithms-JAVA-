package Top150InterviewQuestionsLeetCode;

public class RemoveElement_27 {
    public static int removeElement(int[] nums, int val){
        int i = 0;
        int n = nums.length;
        while (i < n){
            if(nums[i] == val){
                nums[i] = nums[n - 1];
                n--;
            }else{
                i++;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3,2};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }
}
