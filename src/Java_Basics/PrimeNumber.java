package Java_Basics;

import java.util.ArrayList;

public class PrimeNumber {

    // To check a number is prime or not
    public static boolean isPrime(int n){
        int count = 0;
        for (int i = 2; i*i <= n; i++) {
            if(n % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) return true;
        return false;
    }
    public static ArrayList printPrimeNumbers(int low, int high){
        if (low == high) return new ArrayList();
        ArrayList<Integer> result = new ArrayList<>();
        for (int n = low; n <= high; n++) {
            int count = 0;
            int pointer = 0;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0){
                result.add(n);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        ArrayList<Integer> result = printPrimeNumbers(5,15);
        System.out.println(result);
    }
}
