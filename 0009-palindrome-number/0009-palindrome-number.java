class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        if(x < 0 )
            return false;
        int no = x;
        while(no != 0){
            int d = no % 10;
            rev = rev*10 +d;
            no = no/10;
        }
        if (x == rev)
            return true;
        else 
            return false;
    }
}