class Solution {
    public int maxProfit(int[] prices) {
        int pro = 0;
        int low =prices[0];
        int current = 0;
        for(int i=0; i<prices.length; i++){
            low = Math.min(low,prices[i]);
            current = prices[i];
            pro = Math.max(pro,current-low);
        }
        
        return pro;
    }
}