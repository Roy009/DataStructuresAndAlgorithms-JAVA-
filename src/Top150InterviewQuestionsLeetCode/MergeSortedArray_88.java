package Top150InterviewQuestionsLeetCode;

public class MergeSortedArray_88 {
    public static int[] mergeSortedArray(int m, int[] nums1, int n, int[] nums2){
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while(j >= 0){
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
        return nums1;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        int[] result = mergeSortedArray(m,nums1,n, nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
