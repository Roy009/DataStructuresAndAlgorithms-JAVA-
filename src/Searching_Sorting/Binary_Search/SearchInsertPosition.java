package Searching_Sorting.Binary_Search;

public class SearchInsertPosition {
    public static int searchInsertPosition(int[] arr, int x){
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
    public static void main(String[] args) {
        int[] arr = {1,2,4,7};
        int x = 6;
        System.out.println(searchInsertPosition(arr,x));
    }
}
