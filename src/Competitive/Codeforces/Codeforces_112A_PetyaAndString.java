package Competitive.Codeforces;

import java.util.*;

public class Codeforces_112A_PetyaAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next().toLowerCase();
        String str2 = sc.next().toLowerCase();
        if(str1.compareTo(str2) ==0){
            System.out.println("0");
        }
        if(str1.compareTo(str2) > 0){
            System.out.println("1");
        }
        if(str1.compareTo(str2) < 0){
            System.out.println("-1");
        }
    }
}
