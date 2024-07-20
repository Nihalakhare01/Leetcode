class Solution {
    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length-1;
        int maxarea = 0;
        int currarea = 0;

        while(lp < rp){
            int heights = Math.min(height[lp], height[rp]);
            int width = rp - lp;
            currarea = heights * width;
            maxarea = Math.max(maxarea, currarea);

            if(height[lp] < height[rp]){
                lp++;
            }else if(height[lp] == height[rp]){
                rp--;
            }else{
                rp--;
            }
        }

        return maxarea;
    }
}