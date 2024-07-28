class Solution {
    public int findMin(int[] nums) {
        int si = 0;
        int ei = nums.length-1;
        int min = nums[si];
        int mid = si + (ei -si)/2;

        while(si < ei){
            mid = si + (ei -si)/2;

            if(nums[mid] > nums[ei]){
                si = mid +1;
            }else if(nums[mid] < nums[ei]){
                ei = mid;
            }else{
                ei--;
            }
        }    
            return nums[si];


        // while(si <= ei){
        //     min = Math.min(min, Math.min(nums[si], nums[ei]));

        //     if(nums[si] <= nums[ei]){
        //         ei--;
        //     }else{
        //         si++;
        //     }
        // }

        // for(int i=0; i<=mid; i++){
        //     min = Math.min(min, nums[i]);
        // }

        // for(int i=mid+1; i<nums.length; i++){
        //     min = Math.min(min, nums[i]);
        // }
        // return min;
    }
}