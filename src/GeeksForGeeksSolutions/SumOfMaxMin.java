package GeeksForGeeksSolutions;

public class SumOfMaxMin {
    public static int sumOfMaxMin(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return max+min;
    }
    public static void main(String[] args) {
        int[] arr = {-1,1,2,3,5,-4};
        int n = arr.length;
        System.out.println(sumOfMaxMin(arr,n));
    }
}
