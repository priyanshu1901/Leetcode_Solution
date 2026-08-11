class Solution {
    public int singleNumber(int[] arr) {
        int ans = 0;
        for(int ele :arr){
            ans = ans ^ ele;
        }
        return ans;
    }
}