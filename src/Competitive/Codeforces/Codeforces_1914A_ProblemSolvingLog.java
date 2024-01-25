package Competitive.Codeforces;

import java.util.Scanner;

public class Codeforces_1914A_ProblemSolvingLog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int[] arr = new int[27];
            int count = 0;
            int n = sc.nextInt();
            String contestLog = sc.next();
            for (int i = 0; i < n; i++) {
                arr[contestLog.charAt(i) - 'A']++;
                if(arr[contestLog.charAt(i) - 'A'] == contestLog.charAt(i) - 'A' + 1){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
