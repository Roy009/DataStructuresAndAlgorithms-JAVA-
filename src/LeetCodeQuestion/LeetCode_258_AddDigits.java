package LeetCodeQuestion;

public class LeetCode_258_AddDigits {
    static int addDigit(int num){
        int digitalRoot = 0;
        while (num > 0) {
            digitalRoot += num % 10;
            num = num / 10;

            if (num == 0 && digitalRoot > 9) {
                num = digitalRoot;
                digitalRoot = 0;
            }
        }
        return digitalRoot;
    }
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigit(num));
    }
}
