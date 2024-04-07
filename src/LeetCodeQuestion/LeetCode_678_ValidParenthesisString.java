package LeetCodeQuestion;

public class LeetCode_678_ValidParenthesisString {
    public static boolean validParenthesisString(String s){
        int openCount = 0;
        int closeCount = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '*'){
                openCount++;
            }else{
                openCount--;
            }

            if(s.charAt(s.length() - 1 - i) == ')' || s.charAt(s.length() - 1 - i) == '*'){
                closeCount++;
            }else {
                closeCount--;
            }

            if(openCount < 0 || closeCount < 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "(*)";
        System.out.println(validParenthesisString(s));
    }
}
