class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int fp = n-1;

        for(int i = n-2; i>=0; i--){
            if(i + nums[i] >= fp){
                fp = i;
            }
        }

        // if(fp == 0)
        //     return true;
        // else 
        //     return false;

        return fp == 0;
    }
}