class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i:nums){
            hs.add(i);
        }
        int longStreak = 0;
        for(int i:hs){
            if(!hs.contains(i-1)){
                int currStreak = 1;
                int currNum = i;

                while(hs.contains(i+1)){
                    currStreak++;
                    i++;
                }
                longStreak = Math.max(longStreak,currStreak);
            }
        }
        return longStreak;
    }
}
