package LeetCodeQuestion;

public class LeetCode_7_ReverseInteger {
    static int reverseInteger(int x){
        long finalNum = 0;
        while (x != 0){
            int lastdigit = x%10;
            finalNum += lastdigit;
            finalNum = finalNum * 10;
            x = x / 10;
        }
        finalNum = finalNum / 10;
        if (finalNum > Integer.MAX_VALUE || finalNum < Integer.MIN_VALUE){
            return 0;
        }
        if(x < 0){
            return (int)(-1*finalNum);
        }
        return (int) finalNum;
    }
    public static void main(String[] args) {
        System.out.println(reverseInteger(123));
    }
}
