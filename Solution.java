class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buypoint = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < buypoint) {
                buypoint = price;
            }
            maxProfit = Math.max(maxProfit, price - buypoint);
        }

        return maxProfit;
    }
}
