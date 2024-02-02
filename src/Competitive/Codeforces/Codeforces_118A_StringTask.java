package Competitive.Codeforces;

import java.util.*;

public class Codeforces_118A_StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.next().toLowerCase();
        StringBuilder ans = new StringBuilder();
        ArrayList<Character> vowel = new ArrayList<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('y');
        for (int i = 0; i < str.length(); i++) {
            if(!vowel.contains(str.charAt(i))){
                ans.append("."+str.charAt(i));
            }
        }
        System.out.println(ans.toString().toLowerCase());
    }
}
