package Arrays;

public class FrequencyOfAElementInArray {
    public static void frequencyCountOfArray(int[] arr){
//        int[] result = new int[arr.length];
//        int point = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == x) {
                    count++;
                }
            }
            System.out.println("Frequency of " + arr[i] + " is " + count);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,2,1,6,4,6,2,3};
        frequencyCountOfArray(arr);
    }
}
