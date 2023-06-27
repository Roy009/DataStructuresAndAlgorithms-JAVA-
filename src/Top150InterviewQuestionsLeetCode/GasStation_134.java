package Top150InterviewQuestionsLeetCode;

public class GasStation_134 {
    public static int gasStation(int[] gas, int[] cost){
        int totalGain = 0, currGain = 0, answer = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGain += gas[i] - cost[i];
            currGain += gas[i] - cost[i];
            if(currGain < 0){
                answer = i + 1;
                currGain = 0;
            }
        }
        return totalGain >= 0 ? answer : -1;
    }
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(gasStation(gas,cost));
    }
}
