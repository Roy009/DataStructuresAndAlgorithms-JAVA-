package Competitive.Codeforces;

import java.io.*;
import java.util.*;

public class Codeforces_81A_Plugin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String res = br.readLine();
        Stack<Character> stack = new Stack<Character>();
        for (int i = res.length() - 1; i >= 0; i--) {
            char temp = res.charAt(i);
            if (stack.isEmpty())
                stack.push(temp);
            else {
                if (stack.peek() == temp)
                    stack.pop();
                else
                    stack.push(temp);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());
    }
}