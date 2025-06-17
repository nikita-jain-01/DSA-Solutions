// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

package dsa.preparation.dynamicprogramming;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int res=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++) {
            if(min>prices[i])
                min=prices[i];
            if(prices[i]>min) {
                res=res+(prices[i]-min);
                min = prices[i];
            }
            System.out.print(res);
        }
        return res;
    }
}
