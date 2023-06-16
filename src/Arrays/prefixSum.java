package Arrays;

public class prefixSum {
    public static int[] prefixSumArray(int[] arr){
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,3,4,2};
        int[] result = prefixSumArray(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
