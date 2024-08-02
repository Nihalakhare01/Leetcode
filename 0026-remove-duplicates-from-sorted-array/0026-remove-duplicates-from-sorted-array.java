class Solution {
    public int removeDuplicates(int[] nums) {
        int count =0;
        int exnums[] = new int[nums.length];

        exnums[count++] = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] != nums[i]){
                exnums[count++] = nums[i];
            }
        }

        for(int i=0; i<count; i++){
            nums[i] = exnums[i];
        }
        return count; 
    }
}