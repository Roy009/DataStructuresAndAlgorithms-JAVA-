package Recursion;

public class Recursion_1 {
    public static void rec1(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        rec1(n-1);
    }
    public static void rec2(int n){
        if (n > 5) return;
        System.out.print(n + " ");
        rec2(n+1);
    }
    public static void backtrack1(int i, int n){
        if(i < 1) return;
        backtrack1(i-1,n);
        System.out.print(i + " ");
    }
    public static void backtrack2(int i, int n){
        if(i > n) return;
        backtrack2(i+1,n);
        System.out.print(i + " ");
    }
    public static void sumOfFirstNNumbers1(int i, int sum){
        if(i < 1){
            System.out.print(sum);
            return;
        }
        sumOfFirstNNumbers1(i-1,sum+i);
    }
    public static int sumOfFirstNNumbers2(int n){
        if(n < 1){
            return n;
        }
        return n + sumOfFirstNNumbers2(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Printing numbers using recursion in decreasing order");
        rec1(5);
        System.out.println("\nPrinting numbers using recursion in increasing order");
        rec2(1);
        System.out.println("\nPrinting numbers Using Backtracking in increasing order");
        backtrack1(5,5);
        System.out.println("\nPrinting numbers using Backtracking in decreasing order");
        backtrack2(1,5);
        System.out.println("\nPrinting sum of First N numbers using recursion");
        sumOfFirstNNumbers1(3,0);
        System.out.println("\nPrinting sum of First N numbers using recursion");
        System.out.print(sumOfFirstNNumbers2(3));
    }
}
