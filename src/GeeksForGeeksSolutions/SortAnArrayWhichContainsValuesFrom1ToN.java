package GeeksForGeeksSolutions;

public class SortAnArrayWhichContainsValuesFrom1ToN {
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct_position = arr[i] - 1;
            if(arr[correct_position] != arr[i]){
                swap(arr, i, correct_position);
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 6, 1, 4};
        sort(arr);
        for (int a: arr) {
            System.out.print(a + " ");
        }
    }
}
