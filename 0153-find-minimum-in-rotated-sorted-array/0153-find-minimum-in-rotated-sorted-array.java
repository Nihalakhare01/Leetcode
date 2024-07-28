class Solution {
    public int findMin(int[] nums) {
        int si = 0;
        int ei = nums.length-1;
        int min = nums[si];

        while(si < ei){
            int mid = si + (ei - si)/2;

            if( nums[mid] > nums[ei]){
                si = mid +1;
            }else{
                ei = mid;
            }
        }
        return nums[si];

        // while(si <= ei){
        //     if(nums[si] <= nums[ei]){
        //         min = Math.min(min, nums[si]);
        //         break;
        //     }

        //    int  mid = si + (ei - si)/2;
        //     min = Math.min(min, nums[si]);
        //     if(nums[si] <= nums[mid]){
        //         si = mid +1;
        //     }else{
        //         ei = mid;
        //     }
        // }

        // return min;

    }
}