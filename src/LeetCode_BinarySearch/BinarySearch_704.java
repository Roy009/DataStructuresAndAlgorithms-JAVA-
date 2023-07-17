package LeetCode_BinarySearch;

public class BinarySearch_704 {
    public static int binarySearch(int[] arr, int target){
        int i = 0;
        int j = arr.length;
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(arr[mid] > target){
                j = mid - 1;
            }else if(arr[mid] < target){
                i = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 4;
        System.out.println(binarySearch(arr,target));
    }
}
