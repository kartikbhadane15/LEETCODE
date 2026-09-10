class Solution {
    public int digitFrequencyScore(int n) {
        int freq[] =  new int [10];

          while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }
         int score = 0;

        for (int digit = 0; digit <= 9; digit++) {
            if (freq[digit] > 0) {
                score += digit * freq[digit];
            }
        }
        return score;
    }
}