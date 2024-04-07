class Solution {
    public int maxProfit(int[] prices) {
       int[] maximum = new int[prices.length];
         int maxi = 0;
      int minElem = prices[0];
        for(int i = 0; i < prices.length; i++){
           minElem = Math.min(minElem,prices[i]);
           maxi = Math.max(prices[i] - minElem, maxi);

        }
     return Math.max(maxi , 0);
    }
}