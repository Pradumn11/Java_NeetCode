package Array_2Dynamic;

public class Partition_subset_sum {


    public static void main(String[] args) {
       int nums []= {1,5,11,5};
        System.out.println(canPartition(nums));
    }
    public static boolean canPartition(int[] nums)
    {
        int sum=0;

        for(Integer i: nums)
            sum = sum+i;

        if(sum%2 !=0)
            return false;

        else
            return partition_sum(nums , sum/2);
    }

    private static boolean partition_sum(int[] nums ,int sum)
    {
        int n= nums.length;
        boolean[][] dp = new boolean[n+1][sum+1];

        for(int i=0; i<n+1;i++)
        {
            for(int j=0; j<sum+1; j++)
            {
                if(i==0)
                    dp[i][j] = false;

                if(j==0)
                    dp[i][j] = true;
            }
        }

        for(int i=1; i<n+1;i++)
        {
            for(int j=0; j<sum+1;j++) {
                if (nums[i - 1] <= j) {
                    System.out.print(i+" - "+j+" , ");
                    System.out.print(dp[i - 1][j - nums[i - 1]] +" - "+dp[i - 1][j]+" , ");
                    System.out.print(i-1+" = "+ (j-nums[i-1])+" , ");

                    dp[i][j] = dp[i - 1][j - nums[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];

                }
                System.out.println(dp[i][j]);
            }
            System.out.println();
        }

        return dp[n][sum];
    }
}

/*
//  0 -- 0  1  2  3  4  5  6  7  8  9  10  11
         T  F  F  F  F  F  F  F  F  F  F   F
//  1--- 0  1  2  3  4  5  6  7  8  9  10  11
         T
//  2 -- 0  1  2  3  4  5  6  7  8  9  10  11
         T
//  3 -- 0  1  2  3  4  5  6  7  8  9  10  11
         T
//  4 -- 0  1  2  3  4  5  6  7  8  9  10  11
 */