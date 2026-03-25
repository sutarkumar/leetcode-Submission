class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        double calPower = myPow(x,n/2);
        double result = calPower * calPower;
        if (n < 0) {
            x = 1 / x; 
            n = -n;    
        }
        if(n % 2 !=0){
            result = result * x;
        }
        return result;
    }
}
