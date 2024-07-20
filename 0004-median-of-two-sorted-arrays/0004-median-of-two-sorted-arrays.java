class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        double ans =0.00;
        int nums3[] = new int[n1+n2];
        int i=0, j=0,k=0;

        while(i<n1 && j<n2){
            if(nums1[i] < nums2[j])
                nums3[k++] = nums1[i++];
            else
                nums3[k++] = nums2[j++];
        }

        if(i<n1){
              while(i<n1){
            nums3[k++] = nums1[i++];
            }
        }else if(j<n2){
              while(j<n2){
            nums3[k++] = nums2[j++];
            }
        }

        if((n1+n2)%2 != 0){
            int sz = (n1 + n2)/2;
            return ans = (double)nums3[sz];
        }else{
            int sz = (n1+n2)/2;
            int sz2 = sz-1;
            int a = nums3[sz2];
            int b = nums3[sz];
            ans = (double)(a+b)/2;
            return ans;
        }
    }
}