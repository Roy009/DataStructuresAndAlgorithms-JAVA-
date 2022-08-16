package Searching_Sorting;

public class LinearSearch {
    static void linear_search(int[] arr, int element){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                System.out.println("Found the element at " + i + "th position");
                return;
            }
        }
        System.out.println("Element was not found");
    }
    public static void main(String[] args) {
        int [] arr = {34,65,7,890,42,1};
//        linear_search(arr, 53);
        linear_search(arr, 65);

    }
}
