class Solution {
    public int maxProfit(int[] prices) {
        int curr_sum = 0;
        int result = 0;
        for(int i=1; i<prices.length; i++){
            curr_sum = Math.max(curr_sum, 0);
            curr_sum += prices[i] - prices[i-1];
            result = Math.max(result, curr_sum);
        }
        return result;
    }
}