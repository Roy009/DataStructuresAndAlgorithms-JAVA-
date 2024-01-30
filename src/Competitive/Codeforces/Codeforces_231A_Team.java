package Competitive.Codeforces;
import java.util.*;
public class Codeforces_231A_Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            int p3 = sc.nextInt();
            if(p1 == 1 && p2 == 1){
                count++;
            }else if(p1 == 1 && p3 == 1){
                count++;
            }else if(p2 == 1 && p3 == 1){
                count++;
            }
        }
        System.out.print(count);
    }
}
