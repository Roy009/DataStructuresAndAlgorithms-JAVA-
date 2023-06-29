package LeetCodeQuestion;

public class LeetCode_1551_MinimumOperationsToMakeArrayEqual {

    // optimal approach
    public static int minimumOpToEqual1(int n){
        int mid = n / 2;
        return n % 2 == 0 ? (mid * mid) : mid * (mid + 1);
    }

    // Brute Force
    public static int minimumOpToEqual2(int n){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (2 * i) + 1;
        }
        int mid = 0;
        if(n % 2 == 0){
            mid = arr[n/2] - 1;
        }else{
            mid = arr[n/2];
        }
        int count = 0;
        for (int i = 0; i < n/2; i++) {
            int diff = mid - arr[i];
            count += diff;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(minimumOpToEqual1(n));
        System.out.println(minimumOpToEqual2(n));
    }
}
