package LeetCodeQuestion;
import java.util.*;
public class Leetcode_1700_NumberofStudentsUnabletoEatLunch {
    public static int countStudents(int[] students, int[] sandwiches) {
        int len = students.length;
        Stack<Integer> sandwichStack = new Stack<>();
        Queue<Integer> studentQueue = new LinkedList<>();
        for(int i = 0; i < len; i++){
            sandwichStack.push(sandwiches[len - i - 1]);
            studentQueue.offer(students[i]);
        }
        int lastServed = 0;
        while(studentQueue.size() > 0 && lastServed < studentQueue.size()){
            if(studentQueue.peek() == sandwichStack.peek()){
                studentQueue.poll();
                sandwichStack.pop();
                lastServed = 0;
            }else{
                studentQueue.offer(studentQueue.poll());
                lastServed++;
            }
        }
        return studentQueue.size();
    }
    public static void main(String[] args) {
        int[] students = {1,1,0,0};
        int[] sandwiches = {0,1,0,1};
        System.out.println(countStudents(students,sandwiches));
    }
}
