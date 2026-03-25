class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int c = 1;
        for(int d:nums){
            if(d == c){
                c++;
            }
        }
        return c;
    }
}