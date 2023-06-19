package LeetCodeQuestion;

public class LeetCode_55_JumpGame {
    public static int canReach(int[] arr){
        int reach = 0;
        for (int i = 0; i < arr.length; i++) {
            if (reach < i) return 0;
            reach = Math.max(reach, i + arr[i]);
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,1,4};
        int[] arr2 = {3,2,1,0,4};
        System.out.println(canReach(arr1));
        System.out.println(canReach(arr2));
    }
}
