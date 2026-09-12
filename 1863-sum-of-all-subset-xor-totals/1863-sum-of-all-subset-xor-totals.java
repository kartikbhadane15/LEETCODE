class Solution {

    public int subsetXORSum(int[] nums) {
        return findSubset(nums, 0, 0);
    }

    public int findSubset(int[] nums, int i, int xor) {

        // Base case
        if (i == nums.length) {
            return xor;
        }

        // Include nums[i]
        int include = findSubset(nums, i + 1, xor ^ nums[i]);

        // Don't include nums[i]
        int exclude = findSubset(nums, i + 1, xor);

        return include + exclude;
    }
}