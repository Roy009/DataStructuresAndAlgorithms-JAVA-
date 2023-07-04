package LeetCodeQuestion;

import java.util.HashMap;
import java.util.Map;
public class LeetCode_137_SingleNumber_II {
    public static int findSingleNumber(int[] arr){
        Map<Integer, Integer> map = new HashMap();
        for (int a : arr) {
            map.put(a,map.getOrDefault(a, 0) + 1);
        }
        for (int a : arr) {
            if (map.get(a) == 1){
                return a;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,2};
        System.out.println(findSingleNumber(arr));
    }
}
