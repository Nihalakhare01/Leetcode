class Solution {
    public int majorityElement(int[] nums) {
        
        // Arrays.sort(nums);
        // int i =0;
        // while(i < nums.length){
        //         int count=0, j=0;
        //     while(j < nums.length){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //         j++;
        //     }
        //     if(count> (nums.length)/2)
        //         return nums[i];
        //     i++;    
        // }
        // return 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);  
        }

        for(int k : map.keySet()){
            if(map.get(k) > (nums.length/2))
                return k;
        }

        return 0;
    }
}