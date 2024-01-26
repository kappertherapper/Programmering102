import java.util.ArrayList;

public class MaximumProfit {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }

    public static int maxProfit(int[] prices) {
        int highest = prices[prices.length - 1];
        int maxProfit = 0;

        for (int i = prices.length - 2; i >= 0; i--) {
            if (prices[i] > highest) {
                highest = prices[i];
            } else {
                int profit = highest - prices[i];

                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
