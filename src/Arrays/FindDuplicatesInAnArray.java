package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInAnArray {
    public static ArrayList<Integer> findDuplicates(int[] arr){
        // to store the elements and their counts that how many times they occur
        Map<Integer, Integer> map = new HashMap<>();
        // ArrayList for storing the numbers
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i]) && map.get(arr[i]) == 1){
                ans.add(arr[i]);
            }
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,3};
        System.out.println(findDuplicates(arr));
    }
}
