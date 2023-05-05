package LeetCodeQuestion;
import java.util.Set;


// Question - 1456

//Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
//Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
public class LeetCode_1456_VowelsInSubString {

    public static int vowelsCount(String s, int k){
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int count = 0;
        for (int i = 0; i < k; i++) {
            count += vowels.contains(s.charAt(i)) ? 1 : 0;
        }
        int answer = count;
        for (int i = k; i < s.length(); i++) {
            count += vowels.contains(s.charAt(i)) ? 1 : 0;
            count -= vowels.contains(s.charAt(i - k)) ? 1 : 0;
            answer = Math.max(answer, count);
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(vowelsCount("adeioe",3));
    }
}
