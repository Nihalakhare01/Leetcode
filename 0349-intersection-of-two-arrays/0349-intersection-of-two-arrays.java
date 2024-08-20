class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length, n2 = nums2.length;
       List<Integer> res = new ArrayList<>();
        int i=0, j=0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(i < n1 && j < n2){
            if(nums1[i] == nums2[j]){
                int num = nums1[i];
                res.add(nums1[i]);
                while(i < n1 && nums1[i] == num)
                    i++;
                while(j < n2 && nums2[j] == num)
                    j++;     
            }else if(nums1[i] > nums2[j])
                j++;
            else
                i++;    
        }


        int res1[] = new int[res.size()];
        for(int k=0; k<res.size(); k++){
            res1[k] = res.get(k);
        }

        return res1;
    }
}