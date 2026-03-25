class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int[] result = new int[2];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == nums[mid]) {
                result[0] = mid; 
                result[1] = mid; 
                
                while (result[0] > 0 && nums[result[0] - 1] == target) {
                    result[0]--;
                }
                
                while (result[1] < nums.length - 1 && nums[result[1] + 1] == target) {
                    result[1]++;
                }
                
                return result; 
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }

        return new int[]{-1, -1}; 
    }
}