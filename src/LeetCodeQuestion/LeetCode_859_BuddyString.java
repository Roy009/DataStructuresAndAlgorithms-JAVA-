package LeetCodeQuestion;

public class LeetCode_859_BuddyString {
    public static boolean isBuddyString(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }
        if(s.equals(goal)){
            int[] freq = new int[26];
            for(char ch : s.toCharArray()){
                freq[ch - 'a']++;
                if (freq[ch - 'a'] == 2){
                    return true;
                }
            }
            return false;
        }
        int firstIndex = -1;
        int secondIndex = -1;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)){
                if(firstIndex == -1){
                    firstIndex = i;
                }else if (secondIndex == -1){
                    secondIndex = i;
                }else{
                    return false;
                }
            }
        }
        if (secondIndex == -1){
            return false;
        }
        return s.charAt(firstIndex) == goal.charAt(secondIndex) && s.charAt(secondIndex) == goal.charAt(firstIndex);
    }
    public static void main(String[] args) {
        String s = "ab";
        String goal = "ba";
        System.out.println(isBuddyString(s,goal));
    }
}
