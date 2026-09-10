class Solution {

    public int numberOfBeams(String[] bank) {

        int count = 0;
        int previous = 0;

        for (int i = 0; i < bank.length; i++) {

            int current = 0;

            for (int j = 0; j < bank[i].length(); j++) {

                if (bank[i].charAt(j) == '1') {
                    current++;
                }
            }

            if (current > 0) {
                count += previous * current;
                previous = current;
            }
        }

        return count;
    }
}