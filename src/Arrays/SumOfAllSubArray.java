package Arrays;

public class SumOfAllSubArray {
    public static long sumOfAllSubArray1(int[] arr){
        long ans = 0;
        long mod = 1000000007;
        for (int i = 0; i < arr.length; i++) {
            long temp;
            temp = (((i + 1)%mod * (arr.length - i)%mod) * arr[i]%mod);
            ans += temp;
        }
        return ans % mod;
    }
    public static long sumOfAllSubArray2(int[] arr){
        long ans = 0;
        long mod = 1000000007;
        for (int i = 0; i < arr.length; i++) {
            long sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                ans += sum;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(sumOfAllSubArray1(arr));
        System.out.println(sumOfAllSubArray2(arr));
    }
}
