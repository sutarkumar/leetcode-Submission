class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int a = 2, b = 1;  
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = a + b;
            b = a;
            a = current;
        }
        return a;
    }
}
