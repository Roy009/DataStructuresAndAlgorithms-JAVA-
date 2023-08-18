package GeeksForGeeksSolutions;

public class LeftRotate {
    public static void leftRotateArray(int[] arr, int n, int k){
        int mod = k % n;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[(i+mod) % n] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        leftRotateArray(arr, arr.length, k);
    }
}
