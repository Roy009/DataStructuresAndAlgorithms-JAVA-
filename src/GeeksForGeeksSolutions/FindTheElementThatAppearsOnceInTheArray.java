package GeeksForGeeksSolutions;

public class FindTheElementThatAppearsOnceInTheArray {
    // Using XOR Operator
    // [1,2,1]
    // res = 1
    // res = 1 ^ 2
    // res = 2 ^ 1
    // res = 2;
    public static int findTheElementThatAppearsOnceInTheArray(int[] arr){
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        System.out.println(findTheElementThatAppearsOnceInTheArray(arr));
    }
}
