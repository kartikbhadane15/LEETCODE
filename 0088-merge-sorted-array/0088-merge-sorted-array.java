import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] sortedArray = new int[m + n];

        // Copy first m elements of nums1
        for (int i = 0; i < m; i++) {
            sortedArray[i] = nums1[i];
        }

        // Copy all elements of nums2
        for (int i = 0; i < n; i++) {
            sortedArray[m + i] = nums2[i];
        }

        // Sort the combined array
        Arrays.sort(sortedArray);

        // Copy back to nums1
        for (int i = 0; i < m + n; i++) {
            nums1[i] = sortedArray[i];
        }
    }
}