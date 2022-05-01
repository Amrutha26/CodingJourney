class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int min = Integer.MAX_VALUE;
        int n = prices.length;
        
        for(int i=0; i<n; i++) {
            
            // finding the min so that profit can be max
            if(prices[i] < min) {
                min = prices[i];
            }
            
            // finding the max element 
            else if(prices[i] - min > max_profit) {
                max_profit = prices[i] - min;
            }
        }
        
        return max_profit;
    }
}