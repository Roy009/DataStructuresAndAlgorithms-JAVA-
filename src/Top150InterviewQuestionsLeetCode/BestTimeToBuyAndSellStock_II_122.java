package Top150InterviewQuestionsLeetCode;

public class BestTimeToBuyAndSellStock_II_122 {
    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1]){
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
