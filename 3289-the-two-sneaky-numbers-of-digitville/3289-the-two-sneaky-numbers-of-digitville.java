class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        int[] freq = new int[nums.length];
        int[] ans = new int[2];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;

            if (freq[nums[i]] == 2) {
                ans[index] = nums[i];
                index++;
            }
        }

        return ans;
    }
}