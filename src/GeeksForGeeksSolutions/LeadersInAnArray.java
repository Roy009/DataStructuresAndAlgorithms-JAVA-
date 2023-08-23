package GeeksForGeeksSolutions;

import java.util.ArrayList;
import java.util.Stack;

public class LeadersInAnArray {
    public static ArrayList<Integer> leadersInAnArray1(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int right_most_max = arr[arr.length- 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if(right_most_max <= arr[i]){
                right_most_max = arr[i];
                ans.add(right_most_max);
            }
        }
        return ans;
    }
    public static ArrayList<Integer> leadersInAnArray2(int[] arr){
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            if(stack.peek() <= arr[i]){
                stack.push(arr[i]);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!stack.isEmpty()){
            ans.add(stack.pop());
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        System.out.println(leadersInAnArray1(arr));
        System.out.println(leadersInAnArray2(arr));
    }
}
