package LeetCodeQuestion;

public class LeetCode_2073_TimeNeededToBuyTickets {
    public static int timeRequiredToBuy(int[] tickets, int k){
        if(tickets[k] == 1){
            return k + 1;
        }
        int time = 0;
        while(tickets[k] > 0){
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] != 0) {
                    tickets[i]--;
                    time++;
                }
                if (tickets[k] == 0) {
                    return time;
                }
            }
        }
        return time;
    }
    public static void main(String[] args) {
        int[] tickets = {2,3,2};
        int k = 2;
        System.out.println(timeRequiredToBuy(tickets,k));
    }
}
