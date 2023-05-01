package LeetCodeQuestion;

import java.util.Arrays;

public class LeetCode_1491_AverageSalaryExMinMax {
    public static double averageSalary(int[] salary){
        Arrays.sort(salary);
        double sum = 0;
        int count = 0;
        for (int i = 1; i < salary.length-1; i++) {
            sum += salary[i];
            count++;
        }
        return sum/count;
    }
    public static void main(String[] args) {
        int[] salary = {1000,2000,3000,4000};
        System.out.println(averageSalary(salary));
    }
}
