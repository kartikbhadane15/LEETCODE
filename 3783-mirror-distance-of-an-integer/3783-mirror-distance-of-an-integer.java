class Solution {
    public int mirrorDistance(int n) {
        int original  = n;
        int reverse = 0;
        while(n > 0) {
            int lastDigit  = n % 10;
            reverse = reverse * 10 + lastDigit;
            n /= 10;
        }
        return Math.abs(reverse - original);
    }
}