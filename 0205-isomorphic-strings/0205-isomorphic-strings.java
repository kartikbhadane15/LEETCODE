class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] sToT = new int[256];
        int[] tToS = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (sToT[a] != tToS[b]) {
                return false;
            }

            sToT[a] = i + 1;
            tToS[b] = i + 1;
        }

        return true;
    }
}