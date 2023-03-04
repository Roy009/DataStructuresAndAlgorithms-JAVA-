package LeetCodeQuestion;

public class LeetCode_443_StringCompression {
    static int stringCompression(char[] chars) {

        int n = chars.length;

        //Base condition
        if (n == 1){
          return 1;
        }
        // pointers
        int i = 0, j = 0;
        // The pointer i will run for the length of the array which is n
        while(i < n){
            // To keep count of the similar elements
            int count = 1;
            // It will run for till i is less than the array size and char at ith position is equal to i+1 th position
            while(i < (n-1) && chars[i] == chars[i+1]){
                //Increment count and move the i pointer towards right
                count++;
                i++;
            }
            // In place change the chars array.
            chars[j++] = chars[i++];
            // This condition is to value which is greater than 10.
            if(count > 1){
                String countStr = String.valueOf(count);
                for (int k = 0; k < countStr.length(); k++) {
                    chars[j++] = countStr.charAt(k);
                }
            }
        }
        // lastly return the pointer j because it will become the length of the chars arr.
        return j;
    }
    public static void main(String[] args) {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(stringCompression(chars));
    }
}
