package GeeksForGeeksSolutions;

public class FindThreeLargestElements {
    public static void findThreeLargestElements(int[] arr){
        if(arr.length < 3) System.out.println("Invalid Array");
        int first, second, third;
        first = second = third = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }else if(arr[i] > second){
                third = second;
                second = arr[i];
            }else if(arr[i] > third){
                third = arr[i];
            }
        }
        System.out.println("First -> "+ first);
        System.out.println("Second -> "+ second);
        System.out.println("Third -> "+ third);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        findThreeLargestElements(arr);
    }
}
