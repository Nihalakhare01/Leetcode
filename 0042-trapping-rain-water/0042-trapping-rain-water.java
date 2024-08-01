class Solution {
    public int trap(int[] height) {

        int lmax = 0, rmax = 0, total = 0, lp = 0, rp = height.length - 1;

        while( lp < rp){

            if(height[lp] <= height[rp]){

                if(lmax > height[lp]){
                    total += lmax - height[lp];
                }else{
                    lmax = height[lp];
                }
                lp++;

            }else{

                if(rmax > height[rp]){
                    total += rmax - height[rp];
                }else{
                    rmax = height[rp];
                }
                rp--;
            }
        }
        return total;
    }
}