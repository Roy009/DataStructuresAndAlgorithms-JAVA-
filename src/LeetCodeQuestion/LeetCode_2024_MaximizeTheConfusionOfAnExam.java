package LeetCodeQuestion;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_2024_MaximizeTheConfusionOfAnExam {
    public static int maximizeConfusion(String answerKey,int k){
        int i = 0;
        int maxFreq = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < answerKey.length(); j++) {
            char curr = answerKey.charAt(j);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(curr));
            if(j - i + 1 > maxFreq + k){
                map.put(answerKey.charAt(i), map.get(answerKey.charAt(i)) - 1);
                i++;
            }
        }
        return answerKey.length() - i;
    }
    public static void main(String[] args) {
        String answerKey = "TFFT";
        int k = 1;
        System.out.println(maximizeConfusion(answerKey,k));
    }
}
