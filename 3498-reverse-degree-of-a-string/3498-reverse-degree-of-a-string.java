class Solution {
    public int reverseDegree(String s) {
        int productSum = 0;

        for(int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            int reverse = 26 - index;
            productSum += (reverse * (i+1));
        }
       return productSum;
    }
}