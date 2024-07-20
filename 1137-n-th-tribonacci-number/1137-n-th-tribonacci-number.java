class Solution {
    public int tribonacci(int n) {
        int n1 = 0, n2 = 1, n3 = 1, n4;

        for(int i=0; i<n; i++){
            n4 = n1 + n2 + n3;

            n1=n2;
            n2=n3;
            n3=n4;
        }
    return n1;
    }
}