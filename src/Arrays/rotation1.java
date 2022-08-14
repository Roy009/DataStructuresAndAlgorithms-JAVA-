package Arrays;

public class rotation1{

    public  static  void rotate(int arr[], int d, int n){
        int p = 1;
        while (p <= d) {
            // Storing the first element in the temp variable last
            int last = arr[0];
            // rotating/ shifting one variable at a time
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            // Storing the first element at the last position of the array
            arr[n - 1] = last;
            // increasing the p variable
            p++;
        }
        // printing the array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        // rotate the array by d time
        int d = 3;
        // rotate function
        rotate(arr, d, n);
    }
}
