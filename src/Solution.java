public class Solution {
    public static int maxProfitBrute(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int y = i + 1; y < prices.length; y++) {
                if (prices[i] - prices[y] < profit)
                    profit = prices[i] - prices[y];
            }
        }
        profit = profit * -1;
        return profit;
    }

    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minprice = prices[1];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minprice) minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
