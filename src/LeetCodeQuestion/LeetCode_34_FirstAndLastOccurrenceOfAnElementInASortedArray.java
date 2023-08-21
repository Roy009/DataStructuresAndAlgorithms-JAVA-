package LeetCodeQuestion;

import java.util.Arrays;

public class LeetCode_34_FirstAndLastOccurrenceOfAnElementInASortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];
        arr[0]=findFirst(nums,target);
        arr[1]=findLast(nums,target);
        return arr;
    }
    public static int findFirst(int[] arr,int target){
        int index=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                index=mid;
                high=mid-1;
            }
            else if(arr[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return index;
    }
    public static int findLast(int[] arr,int target){
        int index=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                index=mid;
                low=mid+1;
            }
            else if(arr[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4};
        int[] ans = searchRange(arr,2);
        System.out.println(Arrays.toString(ans));
    }
}
