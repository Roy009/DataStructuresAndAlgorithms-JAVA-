package Java_Basics;

import java.util.ArrayList;

public class fibonacciSeries {
    public static ArrayList fibo(int n){
        if(n <= 1) return new ArrayList<>(n);
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(1);
        for (int i = 2; i <= n; i++) {
            result.add(i,result.get(i-1)+result.get(i-2));
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> ans = fibo(6);
        System.out.println(ans);
    }
}
