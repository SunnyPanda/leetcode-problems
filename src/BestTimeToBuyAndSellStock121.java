public class BestTimeToBuyAndSellStock121 {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minBuy) {
                minBuy = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minBuy);
            }
        }
        return maxProfit;
    }
}
