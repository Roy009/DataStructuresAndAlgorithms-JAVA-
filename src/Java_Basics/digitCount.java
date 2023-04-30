package Java_Basics;

import java.util.ArrayList;
import java.util.Collections;

public class digitCount {
    public static int digitcount(int number){
        if (number == 0) return 0;
        int count = 0;
        while (number > 0){
            number = number / 10;
            count++;
        }
        return count;
    }
    public static ArrayList digits(int number){
        if (number == 0) return new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        while (number > 0){
            int temp = number % 10;
            ans.add(temp);
            number = number / 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(digitcount(123456));
        ArrayList<Integer> ans = digits(123456);
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
