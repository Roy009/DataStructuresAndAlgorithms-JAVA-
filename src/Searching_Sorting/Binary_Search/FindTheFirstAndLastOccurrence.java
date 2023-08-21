package Searching_Sorting.Binary_Search;

import java.util.Arrays;

public class FindTheFirstAndLastOccurrence {
    public static int firstOccur(int[] arr, int x){
        int start = 0, end = arr.length - 1, res = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > x){
                end = mid - 1;
            }else if(arr[mid] < x){
                start = mid + 1;
            }else{
                res = mid;
                end = mid - 1;
            }
        }
        return res;
    }
    public static int lastOccur(int[] arr, int x){
        int start = 0, end = arr.length - 1, res = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > x){
                end = mid - 1;
            }else if(arr[mid] < x){
                start = mid + 1;
            }else{
                res = mid;
                start = mid + 1;
            }
        }
        return res;
    }
    public static int[] firstAndLastOccurrence(int[] arr, int key){
        int[] ans = new int[2];
        int first = firstOccur(arr, key);
        int last = lastOccur(arr, key);
        ans[0] = first;
        ans[1] = last;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,4,4};
        int[] ans = firstAndLastOccurrence(arr,2);
        System.out.println(Arrays.toString(ans));
    }
}
