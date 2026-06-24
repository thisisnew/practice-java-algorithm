package leetcode;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    private static int maxProfit(int[] prices) {

        var profit = 0;
        var buy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            var sell = prices[i];

            if (sell > buy) {
                profit = Math.max(profit, sell - buy);
                continue;
            }

            buy = sell;
        }

        return profit;
    }
}
