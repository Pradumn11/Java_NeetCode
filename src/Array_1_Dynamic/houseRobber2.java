package Array_1_Dynamic;

public class houseRobber2 {
    public static void main(String[] args) {
        int nu[] = {1, 2, 3};
        System.out.println(rob(nu));
    }

    public static int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        int a = robsub(nums, 0, n - 1);
        int b = robsub(nums, 1, n);
        return Math.max(a, b);
    }

    private static int robsub(int[] numma, int strt, int end) {
        int n = numma.length;
        int[] dp = new int[end + 1];
        dp[0] = 0;
        dp[strt + 1] = numma[strt];
        for (int i = strt + 1; i < end; i++) {
            dp[i + 1] = Math.max(dp[i], dp[i - 1] + numma[i]);
        }
        return dp[end];
    }
}
