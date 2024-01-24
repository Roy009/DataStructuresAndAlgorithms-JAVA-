package Competitive.Codeforces;

import java.util.Scanner;
import java.lang.*;
public class Codeforces_281A_WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        System.out.print(Character.toUpperCase(ch[0]));
        for (int i = 1; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}
