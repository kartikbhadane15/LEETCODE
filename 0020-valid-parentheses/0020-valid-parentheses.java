
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> input = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                input.push(ch);
            } else {
                if (input.isEmpty()) {
                    return false;
                }

                char top = input.pop();

                if (ch == ')' && top != '(' ||
                    ch == ']' && top != '[' ||
                    ch == '}' && top != '{') {
                    return false;
                }
            }
        }

        return input.isEmpty();
    }
}
