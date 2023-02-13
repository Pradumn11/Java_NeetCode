package Greedy;

//https://leetcode.com/problems/maximum-subarray/description/
public class maximumSubArray {
    public int maxSubArray(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int val : arr) {
            sum += val;
            max = Math.max(sum, max);
            if (sum < 0) sum = 0;
        }
        return max;
    }
}
