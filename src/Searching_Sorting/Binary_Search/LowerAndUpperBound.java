package Searching_Sorting.Binary_Search;

public class LowerAndUpperBound {
    public static int lowerBound(int[] arr, int x){
        int n = arr.length - 1;
        int ans = n;
        int low = 0, high = n;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] >= x){ ans = mid; high = mid - 1;}
            else low = mid + 1;
        }
        return ans;
    }
    public static int upperBound(int[] arr, int x){
        int n = arr.length - 1;
        int ans = n;
        int low = 0, high = n;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] > x){ ans = mid; high = mid - 1;}
            else low = mid + 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        int x = 9;
        System.out.println(lowerBound(arr,x));
        System.out.println(upperBound(arr,x));
    }
}
