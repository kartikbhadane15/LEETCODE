class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i = 0; i < details.length; i++) {
            int age1 = (details[i].charAt(11) - '0') * 10;
            int age2 = (details[i].charAt(12)- '0');
            int totalAge = age1 + age2;

            if(totalAge > 60) {
                count++;
            }
        }
        return count;
    }
}