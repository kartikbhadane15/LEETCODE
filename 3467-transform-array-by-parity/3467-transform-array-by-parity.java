class Solution {
    public int[] transformArray(int[] nums) {
        int[] result = new int[nums.length];
        int even = 0;

        // Count even numbers
        for (int num : nums) {
            if (num % 2 == 0) {
                even++;
            }
        }

        // Fill sorted result
        for (int i = 0; i < nums.length; i++) {
            if (i < even) {
                result[i] = 0;
            } else {
                result[i] = 1;
            }
        }

        return result;
    }
}