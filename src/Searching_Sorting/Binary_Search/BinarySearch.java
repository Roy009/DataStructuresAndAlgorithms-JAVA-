package Searching_Sorting.Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 6;
        int s = 0;
        int e = arr.length - 1;

    }
    static int binarySearch(int[] arr, int target,int start, int end){
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
