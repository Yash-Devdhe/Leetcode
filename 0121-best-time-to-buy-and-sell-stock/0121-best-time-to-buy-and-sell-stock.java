class Solution {
    public int maxProfit(int[] prices) {
        int curr = 0;
        int pur = prices[0];
        int pro = 0;
        for(int i =0; i<prices.length; i++){
            curr = prices[i];
            pur = Math.min(pur,curr);
            pro = Math.max(curr-pur,pro);
        }
        return pro;
    }
}