package Java_Basics;

public class InverseOfANumber {
    public static double inverseOfANumber(int number){
        int inv = 0;
        int op = 1;
        while (number != 0){
            int od = number % 10;
            int id = op;
            int ip = od;

            inv += id * (double)Math.pow(10, ip - 1);
            number = number / 10;
            op++;
        }
        return (int)inv;
    }
    public static void main(String[] args) {
        System.out.println(inverseOfANumber(21453));
    }
}
