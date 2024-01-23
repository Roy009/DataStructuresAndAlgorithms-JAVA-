package Competitive.Codeforces;

import java.util.Scanner;
public class Codeforces_71A_WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextInt();
        String str = null;
        for(int i = 0; i <= t; i++){
            str = sc.nextLine();
            if(str.length() > 10){
                System.out.print(str.charAt(0));
                System.out.print(str.length()-2);
                System.out.println(str.charAt(str.length()-1));
            }else{
                System.out.println(str);
            }
        }
    }
}
