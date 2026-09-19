class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int leftHeight = 0;
        int rightHeight = height.length - 1;

        while (leftHeight < rightHeight) {
            int ht = Math.min(height[leftHeight], height[rightHeight]);
            int width = rightHeight - leftHeight;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            if (height[leftHeight] <  height[rightHeight]) {
                leftHeight++;
            } else {
                rightHeight--;
            }
        }
        return maxWater;
    }
}