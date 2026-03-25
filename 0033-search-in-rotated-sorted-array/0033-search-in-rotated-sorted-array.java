class Solution {
public int search(int[] nums, int target) {
    int low =0;
    int high = nums.length-1;
    while(low <= high){
        int mid = low + (high-low) /2;
        if(nums[mid] == target){
            return mid;
        }else if(nums[0] <= nums[mid]){
            if(nums[0] <= target && target <= nums[mid]){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }else {
            if(nums[mid] <= nums[high]){
                if(nums[mid] <= target && nums[high] >= target){
                    low = mid +1;
                }else{
                    high = mid -1;
                }
            }
        }
    }
    return -1;
}
}

