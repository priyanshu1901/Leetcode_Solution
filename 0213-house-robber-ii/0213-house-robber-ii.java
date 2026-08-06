class Solution {
    public int houserob(int[] arr,int i, int[] dp) {
        int n = arr.length-1;
        if(i>=n) return 0;

        if(dp[i]!=-1) return dp[i];
        int take = arr[i] + houserob(arr,i+2,dp);
        int skip = houserob(arr,i+1,dp);
        return dp[i] = Math.max(take,skip);
    }
    public int houserob1(int[] arr,int i, int[] dp) {
        int n = arr.length;
        if(i>=n) return 0;

        if(dp[i]!=-1) return dp[i];
        int take = arr[i] + houserob1(arr,i+2,dp);
        int skip = houserob1(arr,i+1,dp);
        return dp[i] = Math.max(take,skip);
    }
    public int rob(int[] arr) {
        int n = arr.length;
        if(n==1) return arr[0];
        int[] dp = new int[n];
        Arrays.fill(dp,-1);

        int[] dp1 = new int[n];
        Arrays.fill(dp1,-1);
        return Math.max(houserob(arr,0,dp),houserob1(arr,1,dp1));
    }
}