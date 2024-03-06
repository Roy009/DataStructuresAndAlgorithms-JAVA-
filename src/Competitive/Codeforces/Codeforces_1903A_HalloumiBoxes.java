package Competitive.Codeforces;

import java.util.Scanner;

public class Codeforces_1903A_HalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if(k > 1) {
                System.out.println("Yes");
                continue;
            }
            int flag = 0;
            for (int i = 1; i < n; i++) {
                if(arr[i] < arr[i - 1]){
                    System.out.println("NO");
                    flag = 1;
                    break;
                }
            }
            if(flag != 1){
                System.out.println("YES");
            }
        }
    }
}
