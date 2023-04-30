package Java_Basics;

// importing the Scanner class from util in java
import java.util.Scanner;

public class basic_1 {
    public static void main(String[] args) {
        // Taking Inputs
        // Scanner is a class from which we can take input from user in java
        // To take input from user using scanner we need to create instance
        // of the class Scanner and pass from where we want to take input
        Scanner sc = new Scanner(System.in);

        //int number = sc.nextInt(); // takes integer input from the user
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Integer input " + number);  // prints that number

        // float f_number = sc.nextFloat();
        float f_number = Float.parseFloat(sc.nextLine());
        System.out.println("Float input " + f_number);

        // Now if we want to take String as input we have to use next line
        String str = sc.nextLine(); // but it will give you nothing because of a bug in input od String
        System.out.println("String Input "  + str); // if we want to take integer and string input together we have to parse the integer inputs into their specific types

    }
}
