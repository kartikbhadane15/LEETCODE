import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                common.add(num);
            }
        }

        int[] ans = new int[common.size()];
        int i = 0;

        for (int num : common) {
            ans[i++] = num;
        }

        return ans;
    }
}