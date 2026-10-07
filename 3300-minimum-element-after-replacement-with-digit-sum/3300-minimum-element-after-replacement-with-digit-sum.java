class Solution {
    public int minElement(int[] nums) {
        int ans[] = new int[nums.length];
        int smallestAns = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int digitSum = 0;
            while (nums[i] != 0) {
                int lastDigit = (nums[i] % 10);
                digitSum += lastDigit;
                nums[i] /= 10;
            }
            ans[i] = digitSum;
        }

        for (int i = 0; i < ans.length; i++) {
            smallestAns = Math.min(ans[i], smallestAns);
        }
        return smallestAns;
    }
}