package Recursion;

import java.util.ArrayList;
import java.util.LinkedList;

public class subsequence {
    public static void printSubsequences(int i, int[] arr, ArrayList<Integer> list){
        if (i == arr.length){
            if(list.size() > 0){
                System.out.println(list);
            }
            if(list.size() == 0) System.out.println("[]");
        }else{
            printSubsequences(i+1,arr,list);
            list.add(arr[i]);
            printSubsequences(i+1,arr,list);
            list.remove(list.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        printSubsequences(0,arr,list);
    }
}
