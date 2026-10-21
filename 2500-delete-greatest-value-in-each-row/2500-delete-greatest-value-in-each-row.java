class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ans = 0;

        for (int j = 0; j < grid[0].length; j++) {
            int max = 0;

            for (int i = 0; i < grid.length; i++) {
                Arrays.sort(grid[i]);
                max = Math.max(max, grid[i][grid[i].length - 1 - j]);
            }

            ans += max;
        }

        return ans;
    }
}