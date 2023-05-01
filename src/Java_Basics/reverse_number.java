package Java_Basics;

public class reverse_number {
    public static int reverse_number(int number){
        if(number == 0) return 0;
        int rev = 0;
        int rem;
        while (number > 0){
            rem = number%10;
            rev = (rev * 10) + rem;
            number = number / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverse_number(123));
    }
}
