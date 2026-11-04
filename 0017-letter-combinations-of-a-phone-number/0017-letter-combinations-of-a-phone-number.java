
class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        String[] phone = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(0, digits, phone, new StringBuilder(), result);

        return result;
    }

    public void backtrack(int index, String digits,
                          String[] phone, StringBuilder current,
                          List<String> result) {

        // Base case: combination completed
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        // Get letters for current digit
        String letters = phone[digits.charAt(index) - '0'];

        // Try every possible letter
        for (int i = 0; i < letters.length(); i++) {

            current.append(letters.charAt(i));

            backtrack(index + 1, digits, phone, current, result);

            // Backtrack
            current.deleteCharAt(current.length() - 1);
        }
    }
}
