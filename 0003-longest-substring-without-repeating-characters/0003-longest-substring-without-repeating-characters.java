class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lp =0, rp =0;
        int max =0;
        Set <Character> st = new HashSet();
         while(rp < s.length()){
            char ch = s.charAt(rp);
            
            if(st.add(ch)){
                max = Math.max(max, rp-lp+1);
                rp++;
            }else{
                while(s.charAt(lp) != ch){
                    st.remove(s.charAt(lp));
                    lp++;
                }
                st.remove(ch);
                lp++;
            }
         }
         return max;
    }
}