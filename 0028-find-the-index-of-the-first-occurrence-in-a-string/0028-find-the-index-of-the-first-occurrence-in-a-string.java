class Solution {

    public boolean compare(String haystack, String needle,int i){
        int n1 = haystack.length();
        int n2 = needle.length();

        for(int idx = 0; idx<n2; idx++){
            if(i >= n1)
                return false;
            if(haystack.charAt(i++) != needle.charAt(idx))
                return false;
        }
        return true;
    }

    public int strStr(String haystack, String needle) {
        int n1 = haystack.length();

        for(int i=0; i<n1; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(compare(haystack, needle, i) == true)
                    return i;
            }
        }
        return -1;
    }
}