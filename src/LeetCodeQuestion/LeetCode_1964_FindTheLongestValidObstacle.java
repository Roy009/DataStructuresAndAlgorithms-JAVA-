package LeetCodeQuestion;

import java.util.List;

public class LeetCode_1964_FindTheLongestValidObstacle {
    List<Integer> answer;
    private static int bisectRight(int[] A, int target, int right) {
        if (right == 0)
            return 0;
        int left = 0;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (A[mid] <= target)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }

    public static int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int n = obstacles.length, lisLength = 0;
        int[] answer = new int[n], lis = new int[n];
        for (int i = 0; i < n; ++i) {
            int height = obstacles[i];
            int idx = bisectRight(lis, height, lisLength);
            if (idx == lisLength)
                lisLength++;
            lis[idx] = height;
            answer[i] = idx + 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        int[] res = longestObstacleCourseAtEachPosition(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
