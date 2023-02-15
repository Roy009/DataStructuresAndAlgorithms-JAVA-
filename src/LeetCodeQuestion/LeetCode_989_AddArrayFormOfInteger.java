package LeetCodeQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode_989_AddArrayFormOfInteger {
    static List<Integer> addNum(int[] A, int k ){
        int N = A.length;
        int cur = k;
        List<Integer> ans = new ArrayList();

        int i = N;
        while (--i >= 0 || cur > 0) {
            if (i >= 0)
                cur += A[i];
            ans.add(cur % 10);
            cur /= 10;
        }

        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr =  {2,7,4};
        int k = 181;
        System.out.println(addNum(arr,k));
    }
}
