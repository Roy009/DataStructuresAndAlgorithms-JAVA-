package GeeksForGeeksSolutions;

public class FindTheRotationCountInRotatedSortedArray {
    public static int findTheRotationCountInRotatedSortedArray(int[] arr, int n){
        int min = arr[0], min_ind = 0;
        for (int i = 0; i < n; i++) {
            if(min > arr[i]){
                min = arr[i];
                min_ind = i;
            }
        }
        return min_ind;
    }
    public static void main(String[] args) {
        int[] arr = {5,6,1,2,3,4};
        System.out.println(findTheRotationCountInRotatedSortedArray(arr,arr.length));
    }
}
