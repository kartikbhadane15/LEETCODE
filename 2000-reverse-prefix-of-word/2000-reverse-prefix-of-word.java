
import java.util.Stack;

class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack = new Stack<>();
        int index = word.indexOf(ch);

        if (index == -1) {
            return word;
        }

        for (int i = 0; i <= index; i++) {
            stack.push(word.charAt(i));
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        result.append(word.substring(index + 1));

        return result.toString();
    }
}
