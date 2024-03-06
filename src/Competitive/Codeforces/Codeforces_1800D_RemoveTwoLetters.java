package Competitive.Codeforces;

import java.util.Scanner;

public class Codeforces_1800D_RemoveTwoLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        while(t-- > 0){
            n = sc.nextInt();
            String str = sc.next();
            int ans = n-1;
            int extra = 0;
            for (int i = 0; i < n-2; i++) {
                if(str.charAt(i) == str.charAt(i+2)){
                    extra++;
                }
            }
            System.out.println(ans-extra);
        }
    }
}
