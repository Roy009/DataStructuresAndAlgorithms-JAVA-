package GeeksForGeeksSolutions;

public class ArrayEvenAndOdd {
    public static void arrayEvenAndOdd(int[] arr, int n){
        int i = -1;
        int j = 0;
        while(j != n){
            if(arr[j] % 2 == 0){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        arrayEvenAndOdd(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
