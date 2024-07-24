class Solution {

    public double positive(double x, int n) {
       if( n == 0 )
            return 1;

        double ans = myPow( x, n/2);
        if(n % 2 == 0)
            return ans * ans;
        else 
            return x * ans * ans;    
    }

    public double negative(double x, int n) {
       if( n == 0 )
            return 1;

        double ans = myPow( x, n/2);
        if(n % 2 == 0)
            return ans * ans;
        else 
            return (1/x) * ans * ans;    
    }
  

    public double myPow(double x, int n) {
       if( n > 0)
            return positive(x,n);
        else
            return negative(x,n);
    }
}