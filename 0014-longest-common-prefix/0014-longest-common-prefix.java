class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        Arrays.sort(strs);

        char[] lp = strs[0].toCharArray();
        char[] rp = strs[strs.length-1].toCharArray();

        for(int i=0; i<lp.length; i++){
            if(lp[i] != rp[i])
                break;
            sb.append(lp[i]);
        }

        return sb.toString();
    }
}