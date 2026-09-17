class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }

    private int helper(int[] nums, int i, int xor) {
        // Base case
        if (i == nums.length) {
            return xor;
        }

        // Include nums[i]
        int include = helper(nums, i + 1, xor ^ nums[i]);

        // Don't include nums[i]
        int exclude = helper(nums, i + 1, xor);

        return include + exclude;
    }
}