class Solution {
    public int trap(int[] height) {
        // left max array create
        int leftMaxArray[] = new int[height.length];
        leftMaxArray[0] = height[0];
        for(int i=1; i<height.length;i++){
            leftMaxArray[i] = Math.max(height[i],leftMaxArray[i-1]);
        }
        // right max array create
        int rightMaxArray[] = new int[height.length];
        rightMaxArray[height.length-1] = height[height.length-1];
        for(int i=height.length-2 ; i>=0 ; i--){
            rightMaxArray[i] = Math.max(height[i],rightMaxArray[i+1]);
        }
        int trappedWater = 0;
        // loop
        for(int i=0;i<height.length;i++){
            int waterLevel = Math.min(leftMaxArray[i],rightMaxArray[i]);
            // condition
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
}