class Solution {
    public char kthCharacter(int k) {
        int count = 0;

        while (k > 1) {
            int power = Integer.highestOneBit(k - 1);
            k = k - power;
            count++;
        }

        return (char) ('a' + count);
    }
}