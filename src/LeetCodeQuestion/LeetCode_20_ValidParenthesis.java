package LeetCodeQuestion;

import java.util.Stack;

public class LeetCode_20_ValidParenthesis {
    public static boolean validParenthesis1(String s){
        while(true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            }else {
                return s.isEmpty();
            }
        }
    }
    public static boolean validParenthesis2(String s){
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }else{
                if(st.isEmpty()) return false;
                char ch = st.pop();
                if ((s.charAt(i) != ')' && ch == '(') || (s.charAt(i) != '}' && ch == '{') || (s.charAt(i) != ']' && ch == '[')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()";
        System.out.println(validParenthesis1(s));
        System.out.println(validParenthesis2(s));
    }
}
