package Array_1_Dynamic;

import java.util.Arrays;

public class CoinChange {


    public static void main(String[] args) {
        int arr[]={1,2,5};
        System.out.println(coinChange(arr,11));
    }
    public static int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int dp[] = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < coins.length; i++) {

            for (int j = coins[i]; j < dp.length; j++) {
                if (dp[j - coins[i]] != Integer.MAX_VALUE) {

                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                }
            }
        }
        return dp[dp.length - 1] == Integer.MAX_VALUE ? -1 : dp[dp.length - 1];
    }
}