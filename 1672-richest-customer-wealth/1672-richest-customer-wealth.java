class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest_Wealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }

            if(currentWealth > richest_Wealth) {
              richest_Wealth = currentWealth;
            }
        }
        return richest_Wealth;
    }
}