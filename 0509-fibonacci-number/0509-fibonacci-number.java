class Solution {
    public int fib(int n) {
        int n1 = 0, n2 = 1, n3;
        for (int i=0; i<n; i++){
            n3 = n1 +n2;
            n1 = n2;
            n2 = n3;
        }
        return n1;
    }
}