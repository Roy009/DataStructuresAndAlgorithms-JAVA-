package Competitive.Codeforces;
import java.util.*;
public class Codeforces_158A_NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int kth_place = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] >= arr[kth_place-1] && arr[i] > 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
