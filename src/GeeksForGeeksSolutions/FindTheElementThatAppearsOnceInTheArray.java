package GeeksForGeeksSolutions;

import java.util.HashMap;
import java.util.Map;

public class FindTheElementThatAppearsOnceInTheArray {
    // Using XOR Operator
    // [1,2,1]
    // res = 1
    // res = 1 ^ 2
    // res = 2 ^ 1
    // res = 2;
    public static int findTheElementThatAppearsOnceInTheArrayUsingXOR(int[] arr){
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        return res;
    }
    //
    public static int findTheElementThatAppearsOnceInTheArrayUsingMap(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        System.out.println(findTheElementThatAppearsOnceInTheArrayUsingXOR(arr));
        System.out.println(findTheElementThatAppearsOnceInTheArrayUsingMap(arr));
    }
}
