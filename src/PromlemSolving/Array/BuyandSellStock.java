package PromlemSolving.Array;

public class BuyandSellStock {
    static int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minprofit = prices[0];
        for(int i=0; i<prices.length; i++){
            int profit = prices[i] - minprofit;

            maxprofit = Math.max(maxprofit, profit);

            minprofit = Math.min(minprofit, prices[i]);
        }

       return maxprofit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println(result);
    }
}
