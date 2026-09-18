class Solution {
    public int[] findDegrees(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] degree = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                degree[j] += matrix[i][j];
            }
        }

        return degree;
    }
}