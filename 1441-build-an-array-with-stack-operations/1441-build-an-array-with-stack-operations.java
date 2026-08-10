class Solution {
    public List<String> buildArray(int[] arr, int n) {
        List<String> ans = new ArrayList<>();
        int j = 0;
       for(int i=1;i<=n && j< arr.length;i++){
             ans.add("Push");
            if(arr[j]==i){
                j++;
            }
            else {
                ans.add("Pop");
            }
        }
        return ans;
    }
}