package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllSubArrayOfSizeK {
   static List<Integer> ans = new ArrayList<>();
    public static List<Integer> sumOfAllSubArrayOfSizeK(int[] arr, int k){
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        for (int i = k; i < arr.length; i++) {
            ans.add(sum);
            sum =(sum - arr[i - k]) + arr[i];
        }
        ans.add(sum);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 3;
        System.out.println(sumOfAllSubArrayOfSizeK(arr,k));
    }
}
