package Array_1_Dynamic;

public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
    int n=cost.length;
        int []dp=new int[n+1];
        dp[n]=0;dp[n-1]=cost[n-1];

        for (int i=n-2;i>=0;i--){
            dp[i]=Math.min(dp[i+1]+dp[i],dp[i+2]+dp[i]);
        }
        return Math.min(dp[0],dp[1]);

    }

}
