package LeetCode_BinarySearch;

public class SearchInsertPosition_35 {
    public static int searchInsert(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(target > nums[mid]){
                i=mid+1;
            }else if(target < nums[mid]){
                j=mid-1;
            }else{
                return mid;
            }
        }

        return i;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 5;
        searchInsert(arr,target);
    }
}
