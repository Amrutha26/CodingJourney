class Solution {
    public int search(int[] nums, int target) {
        
        // security check
        if(nums == null || nums.length == 0) return -1;
        
        int left = 0;
        int right = nums.length - 1;
        
        // the loop will break when left points to the smallest element
        while(left < right) {
            int midpoint = left + (right - left) / 2;
            
            if(nums[midpoint] > nums[right]) {
                left = midpoint + 1;
            } else {
                right = midpoint;
            }
        }
        
        // start will have the pivot element
        int start = left;
        left = 0;
        right = nums.length-1;
        
        // to see in which part of the sorted array the target element is present
        if(target >= nums[start] && target <= nums[right]) {
            left = start;
        } else {
            right = start;
        }
        
        // After finding in which sorted array the element is present, we need to do a normal binary search
        while(left <= right) {
            int midpoint = left + (right - left) / 2;
            if(nums[midpoint] == target) {
                return midpoint;
            } else if(nums[midpoint] < target) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        
        return -1;
    }
}