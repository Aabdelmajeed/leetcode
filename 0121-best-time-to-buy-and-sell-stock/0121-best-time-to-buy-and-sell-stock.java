class Solution {
    public int maxProfit(int[] prices) {
       int[] maximum = new int[prices.length];
         int maxi = 0;
      int maxEle = -1;
        for(int i = prices.length - 1 ; i >= 0 ; i--){
            maximum[i] = maxEle;
           maxEle = Math.max(prices[i] , maxEle);

        }
        
        for(int i = 0 ; i < prices.length ; i++){
            maxi = Math.max(maxi , maximum[i] - prices[i]);
        }
        return Math.max(maxi , 0);
    }
}