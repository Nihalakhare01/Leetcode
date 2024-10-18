class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int n = nums.length, rp =0, lp =0, ans = n+1, sum =0;

         for(rp=0; rp < n; rp++){
            sum += nums[rp];
            while(sum >= target){
                ans = Math.min(ans, rp-lp+1);
                sum -= nums[lp++];
            }
         }
         return ans == n+1 ? 0 : ans;
    }
}