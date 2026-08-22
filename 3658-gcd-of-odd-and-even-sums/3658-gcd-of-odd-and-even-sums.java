class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evenSum = n * (n + 1);
        int oddSum = n * n;

        return gcd(evenSum, oddSum);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}