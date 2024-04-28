// Time Complexity : O(m+n)= O(n) where 'n' is the length of the string.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes, https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Any problem you faced while coding this : No

// This approach uses Bottom Up Approach.

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        dp[m-1][n-1] = 1;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1 && j==n-1) continue;
                dp[i][j] = dp[i][j+1]+dp[i+1][j];
            }
        }
        return dp[0][0];
    }
}