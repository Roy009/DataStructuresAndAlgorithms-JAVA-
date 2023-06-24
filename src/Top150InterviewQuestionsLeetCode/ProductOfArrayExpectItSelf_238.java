package Top150InterviewQuestionsLeetCode;

public class ProductOfArrayExpectItSelf_238 {
    public static int[] productExpectItSelf(int[] arr){
        int[] ans = new int[arr.length];
        for (int i = 0, left = 1 ; i < arr.length; i++) {
            ans[i] = left;
            left *= arr[i];
        }
        for (int i = arr.length - 1, right = 1; i >= 0 ; i--) {
            ans[i] *= right;
            right *= arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = productExpectItSelf(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
