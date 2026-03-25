class Solution {
    public int maxProduct(int[] nums) {
        int currArr = 1;
        int maxValue = Integer.MIN_VALUE;
        int minValue = 1;

        for(int i =0;i<nums.length;i++){
            if(nums[i] < 0){
                int temp = currArr;
                currArr = minValue;
                minValue = temp;
            }
            currArr = Math.max(nums[i],currArr * nums[i]);
            minValue = Math.min(nums[i] , minValue * nums[i]);
            maxValue = Math.max(currArr,maxValue);
        }
        return maxValue;
    }
}