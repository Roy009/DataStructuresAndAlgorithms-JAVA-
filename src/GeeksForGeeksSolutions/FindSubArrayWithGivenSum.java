package GeeksForGeeksSolutions;

public class FindSubArrayWithGivenSum {
    public static void findSumWithGivenSum(int[] arr, int sum, int n){
        for (int i = 0; i < n; i++) {
            int currentSum = arr[i];
            if (currentSum == sum){
                System.out.println("Sum found at index " + i);
                return;
            }else{
                for (int j = i + 1; j < n; j++) {
                    currentSum += arr[i];
                    if(currentSum == sum){
                        System.out.println("Sum Found at index " + i + "-" + j);
                        return;
                    }
                }
            }
        }
        System.out.println("Sum Not Found");
        return;
    }
    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        findSumWithGivenSum(arr, 23, arr.length);
    }
}
