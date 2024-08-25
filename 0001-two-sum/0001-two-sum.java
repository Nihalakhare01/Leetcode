class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int diff = 0;

        for(int i=0; i<nums.length; i++){
            diff = target - nums[i];
            if(map.containsKey(diff))
                return new int[]{map.get(diff), i};
            map.put(nums[i], i);
        }
        return new int[]{};
        
        
        // int i=0,j=0;

        //   for( i=0; i<nums.length-1; i++){
        //     for( j=i+1; j<nums.length;j++ ){

        //         if(nums[i] + nums[j] == target)
        //             return new int[]{i,j};
        //         }
        //    }
        //  return new int[]{};

        //  int lp =0, rp = nums.length-1;

        //  while(lp < rp){

        //     if(nums[lp] + nums[rp] == target){
        //          return new int[]{lp, rp};
        //     }else if(nums[lp] + nums[rp] < target){ 
        //         rp--;
        //     }else{ 
        //         lp++;
        //     }    
        //  }
        //  return new int[]{};

        
    }
}