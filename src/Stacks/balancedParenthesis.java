package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class balancedParenthesis {
    static boolean Balanced(String str){
        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty()){
                return false;
            }
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
    public static void main(String[] args) {
        String str = "([{}}])";
        if (Balanced(str)){
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
