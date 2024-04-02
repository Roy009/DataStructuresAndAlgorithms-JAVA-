package LeetCodeQuestion;

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

    public static void main(String[] args) {
        String s = "()";
        System.out.println(validParenthesis1(s));
    }
}
