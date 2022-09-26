package Searching_Sorting;

public class JumpSearch {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        System.out.println(jumpSearch(arr, 55));
    }
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
//        calculating block size to jump
        int step = (int)Math.floor(Math.sqrt(n));

        int prev = 0;
        while (arr[Math.min(step, n) -1] < target) {
            prev = step;
            step += (int)(Math.floor(Math.sqrt(n)));
            if (prev >= n)
                return -1
                        ;
        }
        while (arr[prev] < target){
            prev++;
            if (prev == Math.min(step, n))
                return -1;
        }
        if (arr[prev] == target)
            return prev;
        return -1;
    }


}
