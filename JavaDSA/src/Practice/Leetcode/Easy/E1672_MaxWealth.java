package Practice.Leetcode.Easy;

/**
 * 1672. Richest Customer Wealth
 */
public class E1672_MaxWealth {

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for(int i=0; i<accounts.length; i++) {
            int currWealth = 0;
            for(int j=0; j<accounts[i].length; j++) {
                currWealth = currWealth + accounts[i][j];
            }
            if(currWealth >= maxWealth) {
                maxWealth = currWealth;
            }
        }

        return maxWealth;
    }
}
