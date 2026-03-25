class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,maxlength = 0;
        Set<Character> st = new HashSet<>();

        while(j<s.length()){
            if(!st.contains(s.charAt(j))){
                st.add(s.charAt(j));
                maxlength = Math.max(maxlength,j-i+1);
                j++;
            }else{
                st.remove(s.charAt(i));
                i++;
            }
        }
        return maxlength;
    }
}