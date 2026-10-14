
class Solution {
    public int romanToInt(String s) {
        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = 0;

            if (s.charAt(i) == 'I') {
                current = 1;
            } else if (s.charAt(i) == 'V') {
                current = 5;
            } else if (s.charAt(i) == 'X') {
                current = 10;
            } else if (s.charAt(i) == 'L') {
                current = 50;
            } else if (s.charAt(i) == 'C') {
                current = 100;
            } else if (s.charAt(i) == 'D') {
                current = 500;
            } else if (s.charAt(i) == 'M') {
                current = 1000;
            }

            if (i + 1 < s.length() &&
                current < getValue(s.charAt(i + 1))) {
                number -= current;
            } else {
                number += current;
            }
        }

        return number;
    }

    public int getValue(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000;
    }
}
