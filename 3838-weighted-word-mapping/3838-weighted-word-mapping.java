class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int sum = 0;

            for (int j = 0; j < word.length(); j++) {
                int index = word.charAt(j) - 'a';
                sum += weights[index];
            }

            int value = sum % 26;

            char ch = (char) ('z' - value);

            result.append(ch);
        }

        return result.toString();
    }
}