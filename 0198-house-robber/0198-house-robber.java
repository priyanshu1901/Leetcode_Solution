class Solution {
    public int houseRob(int[] arr, int i,int[] dp){
        int n = arr.length;
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];
        int moneyLeft = arr[i] + houseRob(arr,i+2,dp);
        int moneyRight = 0 + houseRob(arr,i+1,dp);
        return dp[i] = Math.max(moneyRight,moneyLeft);

    }
    public int rob(int[] arr) {
        int n = arr.length; 
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return houseRob(arr,0,dp);
    }
}