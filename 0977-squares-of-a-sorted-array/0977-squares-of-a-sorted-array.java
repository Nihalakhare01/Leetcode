class Solution {
    public int[] sortedSquares(int[] nums) {
        int squares[] = new int[nums.length];
        int lp = 0;
        int rp = nums.length-1;
        int i = nums.length-1;

        while(lp <= rp){
            int lpsquare = nums[lp] * nums[lp];
            int rpsquare =  nums[rp] * nums[rp];

            if(lpsquare < rpsquare || lpsquare == rpsquare){
                squares[i] = rpsquare;
                i--;
                rp--;
            }else {
                squares[i] = lpsquare;
                i--;
                lp++;
            }
        } 
        return squares;   
    }
}