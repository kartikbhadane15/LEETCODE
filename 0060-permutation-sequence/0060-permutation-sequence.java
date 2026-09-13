class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        StringBuilder ans = new StringBuilder();

        // Convert k to 0-based
        k--;

        int fact = 1;

        // Calculate (n-1)!
        for (int i = 1; i < n; i++) {
            fact *= i;
        }

        for (int remaining = n; remaining > 0; remaining--) {
            int index = k / fact;

            ans.append(numbers.get(index));
            numbers.remove(index);

            k = k % fact;

            if (remaining > 1) {
                fact /= (remaining - 1);
            }
        }

        return ans.toString();
    }
}
