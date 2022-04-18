class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        // First column = Only 1 way: by going down
        for(int i=0; i<dp.length; i++) {
            dp[i][0] = 1;
        }
        
        // First row: Only 1 way: by going right
        for(int i=0; i<dp[0].length; i++) {
            dp[0][i] = 1;
        }
        
        // For other cells, we can reach the cell from left or up
        for(int i=1; i<dp.length; i++) {
            for(int j=1; j<dp[0].length; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        
        return dp[m-1][n-1];
    }
}