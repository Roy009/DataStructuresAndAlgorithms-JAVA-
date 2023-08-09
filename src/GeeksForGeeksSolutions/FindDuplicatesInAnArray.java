package GeeksForGeeksSolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInAnArray {
    public static ArrayList<Integer> findDuplicates(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]) && map.get(arr[i]) == 1){
                ans.add(arr[i]);
            }
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        if(ans.isEmpty()){
            ans.add(-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        System.out.println(findDuplicates(arr));
    }
}
