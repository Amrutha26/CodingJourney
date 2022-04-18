class Solution {
    public boolean canJump(int[] nums) {
        
        // Valley Peak Approach
        
        int n = nums.length;
        int reachable = 0;
        
        for(int i=0; i<nums.length; i++) {
            // if reachable is lesser than the current index, then we can't move forward
            if(reachable < i) {
                return false;
            }
            
            // Maximum jump from the current position
            reachable = Math.max(reachable, i+nums[i]);
        }
        
        return true;
    }
}

/* Greedy Approach

public boolean canJump(int[] nums) {
   int lastGoodPos = nums.length - 1;
   
   for(int i=lastGoodPos; i>=0; i--) {
      if(i + nums[i] >= lastGoodPos) {
        lastGoodPos = i;
      }
   }
   
   return lastGoodPos == 0;

}

*/