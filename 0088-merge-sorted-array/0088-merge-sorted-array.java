class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lp = m + n -1;
        int j = n-1;
        int i = m-1;
        while(j >=0 ){
            if(i >=0 && nums1[i] > nums2[j]){
                nums1[lp] = nums1[i];
                i--;
                lp--;
            }else{
                nums1[lp] = nums2[j];
                j--;
                lp--;   
            }
        }
    }
}