package GeeksForGeeksSolutions;

public class MaximumAndMinimum {
    public static void ArrangeMaxMin(int[] arr){
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        int small = 0;
        int large = arr.length - 1;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if(flag){
                arr[i] = temp[large--];
            }else{
                arr[i] = temp[small++];
            }
            flag = !flag;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        ArrangeMaxMin(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
