class Solution {
    public int maxSubArray(int[] nums) {
        
        // Kadane's Algorithm
        int sum = 0;
        int max = nums[0];
        
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            
            // if the sum(found till a given element in an arrayy (subarray)) is greater than the max
            if(sum > max) {
                max = sum;
            } 
            
            // if it is negative, no use in going further as the resulting sum will be reduced
            if(sum < 0) {
                sum = 0;
            }
        }
        
        return max;
    }
}