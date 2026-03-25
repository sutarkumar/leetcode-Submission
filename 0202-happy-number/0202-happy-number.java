class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n = square(n);                
        }
        return n==1;
    }
    public int square(int m){
        int sum = 0;
        while(m!=0){
            int d = m%10;
            sum += d*d;
            m /=10;
        }
        return sum;
    }
}