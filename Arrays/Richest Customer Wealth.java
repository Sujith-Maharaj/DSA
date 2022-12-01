class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximum = 0;
        for(int[] s: accounts)
        {
            int row = 0;
            for(int m: s)
            {
                row = row+m;
            }
            maximum = Math.max(maximum, row);
        }
        return maximum;
    }
}