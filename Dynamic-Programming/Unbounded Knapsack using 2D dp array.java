class Solution{
    static int knapSack(int N, int Capacity, int val[], int wt[])
    {
        int[][] dp = new int[N][Capacity+1];

        for(int i = 0;i<N;i++)
         for(int j = 0;j<Capacity+1;j++)
                dp[i][j] = -1;

        int ans = maxProfit(Capacity, wt, val, 0, N, dp);
       return ans;

    }


    public static int maxProfit(int capacity, int[] weight, int[] profit, int currIndex, int n, int[][]dp) {
        //if capcity is zero at any point, return 0
        if(capacity == 0)
            return 0;
        //base condition when array bounds out of length
        if (currIndex >= n) return 0;

        int currItemWeight = weight[currIndex];
        int currItemProfit = profit[currIndex];

     //check if the dp! = -1; already contains key
        if (dp[currIndex][capacity]!= -1)
            return dp[currIndex][capacity];

        int pickItem = 0;

        //check if weight of current index is less than or equal to capacity only then check for pickItem
        if (currItemWeight <= capacity)
            //pickItem = profit + function call of the same current Index - unbounded Knapsack(includes duplicates)
            pickItem = currItemProfit + maxProfit(capacity - currItemWeight, weight, profit, currIndex, n, dp);

        //dont pick, move to next index
        int nonPickItem = maxProfit(capacity, weight, profit, currIndex + 1, n, dp);

        //check for max and update in dp
        dp[currIndex][capacity] = Math.max(pickItem, nonPickItem);
        return dp[currIndex][capacity];

    }
}

