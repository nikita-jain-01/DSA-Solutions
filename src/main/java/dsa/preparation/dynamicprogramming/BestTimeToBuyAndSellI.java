package dsa.preparation.dynamicprogramming;

public class BestTimeToBuyAndSellI {
    public int maxProfit(int[] prices) {
        int max=0, min=prices[0];
        for(int i=0;i<prices.length;i++) {
            if(min>prices[i])
                min=prices[i];
            if(max<(prices[i]-min))
                max=prices[i]-min;
        }
        return max;
    }
}
