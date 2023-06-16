package Top150InterviewQuestionsLeetCode;

public class BestToBuyAndSellStock_121 {
    public static int maxProfit(int[] prices){
        int profit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            buy = Math.min(prices[i], buy);
            int diff = prices[i] - buy;
            profit = Math.max(diff, profit);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
