package GeeksForGeeksSolutions;

import java.util.ArrayList;

public class EvenPositionGreaterThanOdd {
    public static ArrayList<Integer> evenPositionGreaterThanOdd(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if(i % 2 != 0){
                if(arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }else if(i % 2 == 0){
                if(arr[i] > arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            ans.add(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2};
        System.out.println(evenPositionGreaterThanOdd(arr));
    }
}
