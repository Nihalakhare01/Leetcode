class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int arr[] = new int[n+1];
        int count =0;

        for(int c : citations){
            if( c >= n)
                arr[n]++;
            else
                arr[c]++;
        }
        
        for(int i=n; i>=0; i--){
             count += arr[i];
            if(count >= i)
                return i;
        }
        return 0;
    }
}