class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n * 2];
        for (int i = 0; i < ans.length; i++) {
            if( i < n) {
                ans[i] = nums[i];
            } else {
                ans[i] = nums[2*n -i -1];
            }
        }
        return ans;
    }
}