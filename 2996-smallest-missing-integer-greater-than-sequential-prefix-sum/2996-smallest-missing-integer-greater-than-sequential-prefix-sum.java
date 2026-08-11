class Solution {
    public int missingInteger(int[] arr) {
        int n = arr.length;
        int ans = arr[0];
        HashSet<Integer> set = new HashSet<>();
         for (int x : arr) {
            set.add(x);
        }
        int j = 1;
        while (j < n && arr[j] == arr[j - 1] + 1) {
            ans += arr[j];
            j++;
        }
            while(set.contains(ans)) {
                ans++;
        }
        return ans;
    }
}