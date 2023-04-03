package LeetCodeQuestion;

public class LeetCode_881_BoatToSavePeople {
    public static int boatToSavePeople(int[]people, int limit){
        int left = 0;
        int right = people.length-1;
        int ans = 0;
        while(left <= right){
            ans++;
            if(people[left] + people[right] <= limit){
                left++;
            }
            right--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int limit = 3;
        int[]people = {1,2};
        System.out.println(boatToSavePeople(people,limit));
    }
}
