class Solution {
    public int reverse(int x) {
        int reverse = 0;

        while( x!= 0) {
            int lastDigit = x % 10;

            // Check for overflow
            if (reverse > Integer.MAX_VALUE / 10 ||
               (reverse == Integer.MAX_VALUE / 10 && lastDigit > 7))
                return 0;

            // Check for underflow
            if (reverse < Integer.MIN_VALUE / 10 ||
               (reverse == Integer.MIN_VALUE / 10 && lastDigit < -8))
                return 0;

            reverse = reverse * 10 + lastDigit;
            x /= 10;
        }
        return reverse;
    }
}