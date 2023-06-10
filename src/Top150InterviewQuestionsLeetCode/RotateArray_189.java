package Top150InterviewQuestionsLeetCode;

public class RotateArray_189 {
    public static void rotate(int[] nums, int k){
        k = k % nums.length;
        int i = 0;
        int j = nums.length - 1;
        swap(nums,i,j);
        swap(nums,0,k-1);
        swap(nums,k, nums.length-1);
    }
    static void swap(int[] nums, int i,int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
