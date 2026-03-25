class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev = 0,m=x,d;
        while(x !=0){
            d = x %10;
            rev = rev *10 + d;
            x = x /10;
        }
        if(m == rev){
            return true;
        }else{
            return false;
        }
    }
}