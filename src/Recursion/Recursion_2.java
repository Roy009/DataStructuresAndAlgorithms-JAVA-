package Recursion;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Recursion_2 {


    public static void reverseArray1(int left, int right, int[] arr){
        if(left >= right) return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseArray1(left+1,right-1,arr);
    }
    public static void reverseArray2(Integer[] arr){
        Collections.reverse(Arrays.asList(arr));
    }

    public static boolean checkPalindrome(int i, String str){
        if(str.length() == 0) return false;
        if(i >= str.length() / 2) return false;
        if(str.charAt(i) != str.charAt(str.length() - i - 1)){
            return false;
        }
        return true;
    }

    public static int fibonacciNumber(int n){
        if (n <= 1) return n;
        return fibonacciNumber(n-1) + fibonacciNumber(n-2);
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        reverseArray1(0, arr1.length-1, arr1);
        System.out.println("After reversing the array - 1");
        for (int ele: arr1) {
            System.out.print(ele + " ");
        }
        Integer[] arr2 = {1,2,3,4,5};
        reverseArray2(arr2);
        System.out.println("\nAfter reversing the array - 2");
        for (int ele: arr2) {
            System.out.print(ele + " ");
        }
        System.out.println("\nCheck for palindrome using recursion");
        System.out.println(checkPalindrome(0,"mam"));
        System.out.println("Check for Fibonacci Number");
        System.out.print(fibonacciNumber(3));
    }
}
